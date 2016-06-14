package com.haoxin.app.api.service.impl;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.haoxin.app.api.service.CommonService;
import com.haoxin.app.api.service.UserServiceV0;
import com.haoxin.app.api.service.UserServiceV1;
import com.haoxin.app.api.util.StringUtils;

import net.th2w.components.biz.exception.BizException;
import net.th2w.components.biz.util.BT;
import net.th2w.components.biz.util.ExceptionUtil;

@Service
public class CommonServiceImpl implements CommonService {
	
	private Logger logger = LoggerFactory.getLogger(CommonService.class);

	private @Resource UserServiceV0 service0;

	private @Resource UserServiceV1 service1;
	

	@Override
	public Object listDownloadV0(HttpServletRequest request) throws BizException {
		logger.debug("listDownloadV0-----------");
		String uid = request.getParameter("uid");
		if(BT.STRING.isEmpty(uid)) {
			throw ExceptionUtil.exc(404, "uid is empty!");
		}
		String pageStr = request.getParameter("page");
		String numStr = request.getParameter("num");
		int page = BT.STRING.isEmpty(pageStr) ? 1 : BT.INTEGER.parse(pageStr);
		int num = BT.STRING.isEmpty(numStr) ? 20 : BT.INTEGER.parse(numStr);
		return service0.listDownload(uid, page, num);
	}

	@Override
	public Object listDownloadV1(HttpServletRequest request) throws BizException {
		logger.debug("listDownloadV1-----------");
		String uid = request.getParameter("uid");
		if(BT.STRING.isEmpty(uid)) {
			throw ExceptionUtil.exc(404, "uid is empty!");
		}
		String pageStr = request.getParameter("page");
		String numStr = request.getParameter("num");
		int page = BT.STRING.isEmpty(pageStr) ? 1 : BT.INTEGER.parse(pageStr);
		int num = BT.STRING.isEmpty(numStr) ? 20 : BT.INTEGER.parse(numStr);
		String apkList = request.getParameter("apkList");
		if(!BT.STRING.isEmpty(apkList)) {
			apkList = StringUtils.unescape(apkList);
		} else {
			apkList = "[]";
		}
		return service1.listDownload(uid, page, num, apkList);
	}

}