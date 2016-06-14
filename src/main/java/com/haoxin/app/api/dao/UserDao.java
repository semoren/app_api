package com.haoxin.app.api.dao;

import java.util.List;

import com.haoxin.app.api.model.SubResource;

import net.th2w.components.biz.exception.BizException;


public interface UserDao {

	public List<String> listDownload(String uid, Integer start, Integer row) throws BizException;

	Integer totalDownload(String uid) throws BizException;

	public void updateDownloadV1(String uid, List<SubResource> lists) throws BizException;

	public List<String> listDownloadV1(String uid, int start, int row) throws BizException;
	
}
