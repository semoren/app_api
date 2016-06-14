package com.haoxin.app.api.model;

public class FileInfo {

	private AndroidAttributer androidAttributer;
	private SymbianAttribute symbianAttribute;
	private Integer index;
	private String path;
	private String name;
	private String size;
	private String viewSize;
	private String width;
	private String height;
	private String format;
	private String localPath;
	private String componentName;
	private String twoCode;

	public AndroidAttributer getAndroidAttributer() {
		return androidAttributer;
	}

	public void setAndroidAttributer(AndroidAttributer androidAttributer) {
		this.androidAttributer = androidAttributer;
	}

	public SymbianAttribute getSymbianAttribute() {
		return symbianAttribute;
	}

	public void setSymbianAttribute(SymbianAttribute symbianAttribute) {
		this.symbianAttribute = symbianAttribute;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getViewSize() {
		return viewSize;
	}

	public void setViewSize(String viewSize) {
		this.viewSize = viewSize;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getLocalPath() {
		return localPath;
	}

	public void setLocalPath(String localPath) {
		this.localPath = localPath;
	}

	public String getComponentName() {
		return componentName;
	}

	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

	public String getTwoCode() {
		return twoCode;
	}

	public void setTwoCode(String twoCode) {
		this.twoCode = twoCode;
	}

}
