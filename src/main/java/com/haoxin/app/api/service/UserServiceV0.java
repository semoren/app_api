package com.haoxin.app.api.service;

import com.haoxin.app.api.model.vo.PagePacket;

import net.th2w.components.biz.exception.BizException;

public interface UserServiceV0 {

	PagePacket listDownload(String uid, int page, int num) throws BizException;
}
