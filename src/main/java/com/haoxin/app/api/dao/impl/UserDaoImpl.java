package com.haoxin.app.api.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.haoxin.app.api.dao.UserDao;
import com.haoxin.app.api.model.SubResource;

import net.th2w.components.biz.exception.BizException;
import net.th2w.components.biz.util.ExceptionUtil;

@Repository
public class UserDaoImpl implements UserDao {
	
	private final Cache<String, List<String>> cache;
	
	public UserDaoImpl() {
		this.cache = CacheBuilder.newBuilder().expireAfterAccess(30, TimeUnit.MINUTES).build();
	}

	@Override
	public Integer totalDownload(String uid) throws BizException {
		try {
			List<String> apps = cache.getIfPresent(uid);
			if (!CollectionUtils.isEmpty(apps)) {
				return apps.size();
			}else{
				return 0;
			}
		} catch (Exception e) {
			throw ExceptionUtil.exc(503, "total download error!", e);
		}
	}

	@Override
	public List<String> listDownload(String uid, Integer start, Integer row) throws BizException {
		try {
			List<String> apps = this.cache.getIfPresent(uid);
			List<String> lists = new ArrayList<>();
			int x = 0;
			for (int i = start; i < apps.size(); i++) {
				lists.add(apps.get(i));
				x++;
				if(x == row){
					break;
				}
			}
			return lists;
		} catch (Exception e) {
			throw ExceptionUtil.exc(503, "list download error!");
		}
	}

	@Override
	public void updateDownloadV1(String uid, List<SubResource> lists) throws BizException {
		try {
			List<String> apps = new ArrayList<>();
			for (SubResource subResource : lists) {
				apps.add(subResource.getId());
			}
			this.cache.put(uid, apps);
		} catch (Exception e) {
			throw ExceptionUtil.exc(503, "total download v1 error!", e);
		}
	}

	@Override
	public List<String> listDownloadV1(String uid, int start, int row) throws BizException {
		try {
			List<String> apps = this.cache.getIfPresent(uid);
			List<String> lists = new ArrayList<>();
			int x = 0;
			for (int i = start; i < apps.size(); i++) {
				lists.add(apps.get(i));
				x++;
				if(x == row){
					break;
				}
			}
			return lists;
		} catch (Exception e) {
			throw ExceptionUtil.exc(503, "list download error!");
		}
	}

}
