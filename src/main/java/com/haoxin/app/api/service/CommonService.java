package com.haoxin.app.api.service;

import javax.servlet.http.HttpServletRequest;

import net.th2w.components.biz.exception.BizException;

public interface CommonService {

	Object listDownloadV0(HttpServletRequest request) throws BizException;

	Object listDownloadV1(HttpServletRequest request) throws BizException;

}
