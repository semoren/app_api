package com.haoxin.app.api.model;

import java.util.Date;

public class ProductInfo {

	private String productId;
	private Integer status;
	private Date lastModifyTime;
	private Long lastModifyTimestamp;
	private String lastModifyUser;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getLastModifyTime() {
		return lastModifyTime;
	}

	public void setLastModifyTime(Date lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}

	public Long getLastModifyTimestamp() {
		return lastModifyTimestamp;
	}

	public void setLastModifyTimestamp(Long lastModifyTimestamp) {
		this.lastModifyTimestamp = lastModifyTimestamp;
	}

	public String getLastModifyUser() {
		return lastModifyUser;
	}

	public void setLastModifyUser(String lastModifyUser) {
		this.lastModifyUser = lastModifyUser;
	}

}
