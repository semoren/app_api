package com.haoxin.app.api.model.vo;

import java.util.List;

import net.th2w.components.biz.util.BT;

public class PagePacket {

	private int pageNo;

	private int pageRow;

	private int totalPage;

	private int totalNum;
	
	private List<ResourceVo> data;

	public PagePacket() {
		this(1, 20);
	}

	public PagePacket(int pageNo) {
		this(pageNo, 20);
	}

	public PagePacket(int pageNo, int pageRow) {
		this.pageNo = pageNo;
		this.pageRow = pageRow;
	}

	public int getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
		this.totalPage = BT.INTEGER.parse(Math.ceil((double)totalNum / pageRow));
	}

	public int getPageNo() {
		return pageNo;
	}
	
	public int getTotalPage() {
		return totalPage;
	}

	public List<ResourceVo> getData() {
		return data;
	}

	public void setData(List<ResourceVo> data) {
		this.data = data;
	}

	public int getPageRow() {
		return pageRow;
	}
}
