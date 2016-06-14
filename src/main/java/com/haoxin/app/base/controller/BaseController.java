package com.haoxin.app.base.controller;

import net.th2w.components.biz.exception.BizException;
import net.th2w.components.biz.packet.BizPacket;
import net.th2w.components.biz.util.BT;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

public abstract class BaseController {

	private static Logger log = Logger.getLogger(BaseController.class);

	protected BizPacket getSuccessPacket(Object data) {
		BizPacket packet = new BizPacket();
		packet.setCode(200);
		packet.setMsg(BT.EMPTY);
		packet.setData(data);
		return packet;
	}

	protected BizPacket getErrorPacket(BizException e) {
		BizPacket packet = e.getPacket();
		if(packet.getCode() == 503) log.error("System error!", e);
		packet.setData(BT.EMPTY);
		return packet;
	}

	protected int getVersion(HttpServletRequest request) {
		String v = request.getParameter("v");
		return BT.INTEGER.parse(v);
	}
}
