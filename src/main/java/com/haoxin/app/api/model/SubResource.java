package com.haoxin.app.api.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="subResource")
public class SubResource {

	@Id
	private String id;
	private String resId;
	private String serialNumber;
	private String resSerialNumber;
	private String name;
	private String resNature;
	private String sort;
	private Boolean hasQDA;
	private String processingStatus;
	private String exProductId;
	private String provide;
	private String billingModel;
	private String billingChannel;
	private Long price;
	private Long unitPrice;
	private String profitPercentage;
	private List<String> previewMaps;
	private List<String> icons;
	private List<String> logos;
	private List<String> keyword;
	private String productDesc;
	private Integer allFileCount;
	private String remark;
	private StatusInfo statusInfo;
	private VideoRes videoRes;
	private AudioRes audioRes;
	private ImageRes imageRes;
	private SoftRes softRes;
	private GameRes gameRes;
	private ThemeRes themeRes;
	private List<ModelInfo> modelList;
	private List<FrameInfo> frameList;
	private List<String> channelList;
	private String advertisement;
	private ProductMark productMark;
	private ProductStatisticsInfo statisticsInfo;
	private Integer integral;
	private String relativeRootPath;
	private String displayLanguage;
	private String fileUploadPath;
	private String previewsUploadPath;
	private String iconUploadPath;
	private String source;
	private String cp;
	private Integer index;
	private List<ProductInfo> products;
	private List<ChannelInfo> channels;
	private FileInfo fileInfo;
	private String identifier;
	private Boolean isMultiplexing;
	private Boolean isResUpload;
	private Long hotst;
	private Long newst;
	private Integer star;
	private boolean isCrawlingCms;
	private String appliType;
	private String extComment;
	private String localPath;
	private String componentName;
	private String productTag;
	private Boolean hasAd;
	private Integer boutique;
	private String imgTag;
	private List<ColorTag> colorTags;
	private String tvIcon;
	private String tvBackground;
	private String tvPreview;
	private String tvFilePath;
	private String handle;
	private Integer mainHandle;
	private HandleModeSupport handleModeSupport;
	private List<ResInfo> resInfos;

	public String getId() {
		return id;
	}

	public void setId(String _id) {
		this.id = _id;
	}

	public String getResId() {
		return resId;
	}

	public void setResId(String resId) {
		this.resId = resId;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getResSerialNumber() {
		return resSerialNumber;
	}

	public void setResSerialNumber(String resSerialNumber) {
		this.resSerialNumber = resSerialNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResNature() {
		return resNature;
	}

	public void setResNature(String resNature) {
		this.resNature = resNature;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public Boolean getHasQDA() {
		return hasQDA;
	}

	public void setHasQDA(Boolean hasQDA) {
		this.hasQDA = hasQDA;
	}

	public String getProcessingStatus() {
		return processingStatus;
	}

	public void setProcessingStatus(String processingStatus) {
		this.processingStatus = processingStatus;
	}

	public String getExProductId() {
		return exProductId;
	}

	public void setExProductId(String exProductId) {
		this.exProductId = exProductId;
	}

	public String getProvide() {
		return provide;
	}

	public void setProvide(String provide) {
		this.provide = provide;
	}

	public String getBillingModel() {
		return billingModel;
	}

	public void setBillingModel(String billingModel) {
		this.billingModel = billingModel;
	}

	public String getBillingChannel() {
		return billingChannel;
	}

	public void setBillingChannel(String billingChannel) {
		this.billingChannel = billingChannel;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Long unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getProfitPercentage() {
		return profitPercentage;
	}

	public void setProfitPercentage(String profitPercentage) {
		this.profitPercentage = profitPercentage;
	}

	public List<String> getPreviewMaps() {
		return previewMaps;
	}

	public void setPreviewMaps(List<String> previewMaps) {
		this.previewMaps = previewMaps;
	}

	public List<String> getIcons() {
		return icons;
	}

	public void setIcons(List<String> icons) {
		this.icons = icons;
	}

	public List<String> getLogos() {
		return logos;
	}

	public void setLogos(List<String> logos) {
		this.logos = logos;
	}

	public List<String> getKeyword() {
		return keyword;
	}

	public void setKeyword(List<String> keyword) {
		this.keyword = keyword;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public Integer getAllFileCount() {
		return allFileCount;
	}

	public void setAllFileCount(Integer allFileCount) {
		this.allFileCount = allFileCount;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public StatusInfo getStatusInfo() {
		return statusInfo;
	}

	public void setStatusInfo(StatusInfo statusInfo) {
		this.statusInfo = statusInfo;
	}

	public VideoRes getVideoRes() {
		return videoRes;
	}

	public void setVideoRes(VideoRes videoRes) {
		this.videoRes = videoRes;
	}

	public AudioRes getAudioRes() {
		return audioRes;
	}

	public void setAudioRes(AudioRes audioRes) {
		this.audioRes = audioRes;
	}

	public ImageRes getImageRes() {
		return imageRes;
	}

	public void setImageRes(ImageRes imageRes) {
		this.imageRes = imageRes;
	}

	public SoftRes getSoftRes() {
		return softRes;
	}

	public void setSoftRes(SoftRes softRes) {
		this.softRes = softRes;
	}

	public GameRes getGameRes() {
		return gameRes;
	}

	public void setGameRes(GameRes gameRes) {
		this.gameRes = gameRes;
	}

	public ThemeRes getThemeRes() {
		return themeRes;
	}

	public void setThemeRes(ThemeRes themeRes) {
		this.themeRes = themeRes;
	}

	public List<ModelInfo> getModelList() {
		return modelList;
	}

	public void setModelList(List<ModelInfo> modelList) {
		this.modelList = modelList;
	}

	public List<FrameInfo> getFrameList() {
		return frameList;
	}

	public void setFrameList(List<FrameInfo> frameList) {
		this.frameList = frameList;
	}

	public List<String> getChannelList() {
		return channelList;
	}

	public void setChannelList(List<String> channelList) {
		this.channelList = channelList;
	}

	public String getAdvertisement() {
		return advertisement;
	}

	public void setAdvertisement(String advertisement) {
		this.advertisement = advertisement;
	}

	public ProductMark getProductMark() {
		return productMark;
	}

	public void setProductMark(ProductMark productMark) {
		this.productMark = productMark;
	}

	public ProductStatisticsInfo getStatisticsInfo() {
		return statisticsInfo;
	}

	public void setStatisticsInfo(ProductStatisticsInfo statisticsInfo) {
		this.statisticsInfo = statisticsInfo;
	}

	public Integer getIntegral() {
		return integral;
	}

	public void setIntegral(Integer integral) {
		this.integral = integral;
	}

	public String getRelativeRootPath() {
		return relativeRootPath;
	}

	public void setRelativeRootPath(String relativeRootPath) {
		this.relativeRootPath = relativeRootPath;
	}

	public String getDisplayLanguage() {
		return displayLanguage;
	}

	public void setDisplayLanguage(String displayLanguage) {
		this.displayLanguage = displayLanguage;
	}

	public String getFileUploadPath() {
		return fileUploadPath;
	}

	public void setFileUploadPath(String fileUploadPath) {
		this.fileUploadPath = fileUploadPath;
	}

	public String getPreviewsUploadPath() {
		return previewsUploadPath;
	}

	public void setPreviewsUploadPath(String previewsUploadPath) {
		this.previewsUploadPath = previewsUploadPath;
	}

	public String getIconUploadPath() {
		return iconUploadPath;
	}

	public void setIconUploadPath(String iconUploadPath) {
		this.iconUploadPath = iconUploadPath;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public List<ProductInfo> getProducts() {
		return products;
	}

	public void setProducts(List<ProductInfo> products) {
		this.products = products;
	}

	public List<ChannelInfo> getChannels() {
		return channels;
	}

	public void setChannels(List<ChannelInfo> channels) {
		this.channels = channels;
	}

	public FileInfo getFileInfo() {
		return fileInfo;
	}

	public void setFileInfo(FileInfo fileInfo) {
		this.fileInfo = fileInfo;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public Boolean getIsMultiplexing() {
		return isMultiplexing;
	}

	public void setIsMultiplexing(Boolean isMultiplexing) {
		this.isMultiplexing = isMultiplexing;
	}

	public Boolean getIsResUpload() {
		return isResUpload;
	}

	public void setIsResUpload(Boolean isResUpload) {
		this.isResUpload = isResUpload;
	}

	public Long getHotst() {
		return hotst;
	}

	public void setHotst(Long hotst) {
		this.hotst = hotst;
	}

	public Long getNewst() {
		return newst;
	}

	public void setNewst(Long newst) {
		this.newst = newst;
	}

	public Integer getStar() {
		return star;
	}

	public void setStar(Integer star) {
		this.star = star;
	}

	public boolean isCrawlingCms() {
		return isCrawlingCms;
	}

	public void setCrawlingCms(boolean isCrawlingCms) {
		this.isCrawlingCms = isCrawlingCms;
	}

	public String getAppliType() {
		return appliType;
	}

	public void setAppliType(String appliType) {
		this.appliType = appliType;
	}

	public String getExtComment() {
		return extComment;
	}

	public void setExtComment(String extComment) {
		this.extComment = extComment;
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

	public String getProductTag() {
		return productTag;
	}

	public void setProductTag(String productTag) {
		this.productTag = productTag;
	}

	public Boolean getHasAd() {
		return hasAd;
	}

	public void setHasAd(Boolean hasAd) {
		this.hasAd = hasAd;
	}

	public Integer getBoutique() {
		return boutique;
	}

	public void setBoutique(Integer boutique) {
		this.boutique = boutique;
	}

	public String getImgTag() {
		return imgTag;
	}

	public void setImgTag(String imgTag) {
		this.imgTag = imgTag;
	}

	public List<ColorTag> getColorTags() {
		return colorTags;
	}

	public void setColorTags(List<ColorTag> colorTags) {
		this.colorTags = colorTags;
	}

	public String getTvIcon() {
		return tvIcon;
	}

	public void setTvIcon(String tvIcon) {
		this.tvIcon = tvIcon;
	}

	public String getTvBackground() {
		return tvBackground;
	}

	public void setTvBackground(String tvBackground) {
		this.tvBackground = tvBackground;
	}

	public String getTvPreview() {
		return tvPreview;
	}

	public void setTvPreview(String tvPreview) {
		this.tvPreview = tvPreview;
	}

	public String getTvFilePath() {
		return tvFilePath;
	}

	public void setTvFilePath(String tvFilePath) {
		this.tvFilePath = tvFilePath;
	}

	public String getHandle() {
		return handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}

	public Integer getMainHandle() {
		return mainHandle;
	}

	public void setMainHandle(Integer mainHandle) {
		this.mainHandle = mainHandle;
	}

	public HandleModeSupport getHandleModeSupport() {
		return handleModeSupport;
	}

	public void setHandleModeSupport(HandleModeSupport handleModeSupport) {
		this.handleModeSupport = handleModeSupport;
	}

	public List<ResInfo> getResInfos() {
		return resInfos;
	}

	public void setResInfos(List<ResInfo> resInfos) {
		this.resInfos = resInfos;
	}

}
