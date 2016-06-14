package com.haoxin.app.api.model.vo;

import java.util.LinkedList;
import java.util.List;

import com.haoxin.app.api.model.FrameResType;
import com.haoxin.app.api.model.HandleModeSupport;
import com.haoxin.app.api.model.SubResource;

public class ResourceVo {

	private final String resUrl;

	private final SubResource res;

	private final FrameResType type;

	public ResourceVo(SubResource res, String resUrl, FrameResType type) {
		this.res = res;
		this.resUrl = resUrl;
		this.type = type;
	}

	public String getSubId () {
		return res.getId();
	}

	public String getFieldId() {
		return res.getId();
	}

	public String getName() {
		return res.getName();
	}

	public String getPath() {
		try {
			return resUrl + "/" + res.getFileInfo().getPath();
		} catch (Exception e) { return null; }
	}

	public String getLocalPath() {
		try {
			return res.getFileInfo().getLocalPath();
		} catch (Exception e) { return null; }
	}

	public Integer getDownloadCount() {
		return 0;
	}

	public Integer getSize() {
		try {
			return Integer.parseInt(res.getFileInfo().getSize());
		} catch (Exception e) { return null; }
	}

	public Long getPrice() {
		return res.getPrice();
	}

	public Integer getStar() {
		if(res ==null || res.getStar() == null) return 0;
		return res.getStar();
	}

	public Integer getProductMark() {
		if(res == null || res.getStar() == null) return 0;
		return res.getStar();
	}

	public String getIcon() {
		List<String> icons = res.getIcons();
		if (icons != null && icons.size() != 0) {
			return resUrl + "/" + icons.get(0);
		}
		return null;
	}

	public String getLogo() {
		List<String> icons = res.getLogos();
		if (icons != null && icons.size() != 0) {
			return icons.get(0);
		}
		return null;
	}

	public String getCp() {
		return res.getCp();
	}

	public String getAdvertisement() {
		return res.getAdvertisement();
	}

	public String getCategory() {
		return type == null ? null : type.getName();
	}

	public String getCategoryId() {
		return type == null ? null : type.getId();
	}

	public String getTwoCode() {
		return null;
	}

	public String getComponentName() {
		try {
		return res.getFileInfo().getComponentName();
		} catch (Exception e) { return null; }
	}

	public String getPackageName() {
		try {
			return res.getFileInfo().getAndroidAttributer().getPackageName();
		} catch (Exception e) { return null; }
	}

	public String getVersionCode() {
		try {
			return res.getFileInfo().getAndroidAttributer().getVersionCode();
		} catch (Exception e) { return null; }
	}

	public String getVersionName() {
		try {
			return res.getFileInfo().getAndroidAttributer().getVersionName();
		} catch (Exception e) { return null; }
	}

	public String getProductDesc() {
		return res.getProductDesc();
	}

	public Integer getOnlineCount() {
		// TODO
		return 0;
	}

	public List<String> getPreviewMap() {
		List<String> maps = res.getPreviewMaps();
		
		List<String> resultSet = new LinkedList<String>();
		
		for (String string : maps) {
			resultSet.add(resUrl + "/" + string);
		}
		return resultSet;
	}

	public String getExtComment() {
		return res.getExtComment();
	}

	public String getTvIcon() {
		return resUrl + "/" + res.getTvIcon();
	}

	public String getTvBackground() {
		return res.getTvBackground();
	}

	public String getTvPreview() {
		return resUrl + "/" + res.getTvPreview();
	}

	public String getSort() {
		return res.getSort();
	}

	public HandleModeSupport getHandleModeSupport() {
		return res.getHandleModeSupport();
	}
}