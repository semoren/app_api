package com.haoxin.app.api.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.haoxin.app.api.service.CommonService;
import com.haoxin.app.base.controller.BaseController;
import net.th2w.components.biz.exception.BizException;

@Controller
public class MyAppController extends BaseController{
	
	private @Resource CommonService service;
	
	@RequestMapping(value = "/download/list")
	public @ResponseBody Object downloadList(HttpServletRequest request) {
		try {
			switch (getVersion(request)) {
			case 1:
				return service.listDownloadV1(request);
			default:
				return service.listDownloadV0(request);
			}
		} catch (BizException e) {
			return getErrorPacket(e);
		}
	}
}
