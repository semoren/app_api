package com.haoxin.app.api.service.impl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.haoxin.app.api.dao.ResourceDao;
import com.haoxin.app.api.dao.UserDao;
import com.haoxin.app.api.model.FrameResType;
import com.haoxin.app.api.model.SubResource;
import com.haoxin.app.api.model.vo.PagePacket;
import com.haoxin.app.api.model.vo.ResourceVo;
import com.haoxin.app.api.service.UserServiceV0;

@Service
public class UserServiceV0Impl implements UserServiceV0 {

	private @Resource UserDao dao;

	private @Resource ResourceDao rdao;

	private @Value("${res.url}") String resUrl;


	@Override
	public PagePacket listDownload(String uid, int page, int num) {
		PagePacket packet = new PagePacket(page, num);
		try {
			Integer totalNum = dao.totalDownload(uid);
			if(totalNum != null && totalNum > 0) {
				int start = (page - 1) * num;
				List<String> apps = dao.listDownload(uid, start, num);
				if(apps != null && apps.size() > 0) {
					List<SubResource> list = rdao.listById(apps);
					List<ResourceVo> results = new ArrayList<>();
					for(SubResource res : list) {
						FrameResType type = null;
						results.add(new ResourceVo(res, resUrl, type));
					}
					packet.setData(results);
				}
				packet.setTotalNum(totalNum);
			} else {
				packet.setTotalNum(0);
			}
		} catch (Exception e) {
		}
		return packet;
	}
}
