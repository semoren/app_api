package com.haoxin.app.api.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.haoxin.app.api.dao.ResourceDao;
import com.haoxin.app.api.dao.UserDao;
import com.haoxin.app.api.model.FrameResType;
import com.haoxin.app.api.model.SubResource;
import com.haoxin.app.api.model.vo.PagePacket;
import com.haoxin.app.api.model.vo.ResourceVo;
import com.haoxin.app.api.service.UserServiceV0;
import com.haoxin.app.api.service.UserServiceV1;
import net.th2w.components.biz.util.BT;

@Service
public class UserServiceV1Impl implements UserServiceV1 {

	private @Resource ObjectMapper mapper;

	private @Resource UserServiceV0 service0;

	private @Resource UserDao dao;

	private @Resource ResourceDao rdao;

	private @Value("${res.url}") String resUrl;

	@SuppressWarnings("unchecked")
	public Object listDownload(String uid, int page, int num, String apkList) {
		PagePacket packet = new PagePacket(page, num);
		try {
			List<String> apps = new ArrayList<String>();
			if(!BT.STRING.isEmpty(apkList)) {
				List<Map<Object, Object>> list = mapper.readValue(apkList, ArrayList.class);
				for(Map<Object, Object> apk : list) {
					if(apk.containsKey("package_name")) {
						apps.add(BT.STRING.parse(apk.get("package_name")));
					}
				}
			}
			if(apps.isEmpty()) {
				return service0.listDownload(uid, page, num);
			}
			// 获取总数
			Integer totalNum = rdao.count(apps);
			// 获取所有数据
			List<SubResource> list = rdao.list(apps);
			// 将SubResource的id存入缓存
			dao.updateDownloadV1(uid, list);
			if(totalNum != null && totalNum > 0) {
				int start = (page - 1) * num;
				List<String> result = dao.listDownloadV1(uid, start, num);
				if(result != null && result.size() > 0) {
					packet.setData(getResources(result));
				}
				packet.setTotalNum(totalNum);
			} else {
				packet.setTotalNum(0);
			}
		} catch (Exception e) {
		}
		return packet;
	}

	private List<ResourceVo> getResources(List<String> apps) throws Exception {
		List<SubResource> list = rdao.listById(apps);
		List<ResourceVo> results = new ArrayList<>();
		for(SubResource res : list) {
			FrameResType type = null;
			results.add(new ResourceVo(res, resUrl, type));
		}
		return results;
	}

}
