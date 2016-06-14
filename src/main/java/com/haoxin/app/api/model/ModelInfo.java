package com.haoxin.app.api.model;

public class ModelInfo
{

  private String modelId;

  private String modelCode;

  private String adapteType;

  private String status;

  private Integer allSize;

  private Integer allCount;

  private DefaultSub defaultSub;

  public String getModelId()
  {
    return this.modelId;
  }

  public void setModelId(String modelId)
  {
    this.modelId = modelId;
  }

  public String getModelCode()
  {
    return this.modelCode;
  }

  public void setModelCode(String modelCode)
  {
    this.modelCode = modelCode;
  }

  public String getAdapteType()
  {
    return this.adapteType;
  }

  public void setAdapteType(String adapteType)
  {
    this.adapteType = adapteType;
  }

  public String getStatus()
  {
    return this.status;
  }

  public void setStatus(String status)
  {
    this.status = status;
  }

  public Integer getAllSize()
  {
    return this.allSize;
  }

  public void setAllSize(Integer allSize)
  {
    this.allSize = allSize;
  }

  public Integer getAllCount()
  {
    return this.allCount;
  }

  public void setAllCount(Integer allCount)
  {
    this.allCount = allCount;
  }

  public DefaultSub getDefaultSub()
  {
    return this.defaultSub;
  }

  public void setDefaultSub(DefaultSub defaultSub)
  {
    this.defaultSub = defaultSub;
  }

  public boolean equals(Object obj)
  {
    ModelInfo modelInfo = (ModelInfo)obj;
    if (this.modelId == null || "".equals(this.modelId)) {
      return false;
    }
    if (this.modelId.equals(modelInfo.getModelId())) {
      return true;
    }
    return false;
  }

  public int hashCode()
  {
    if (this.modelId == null || "".equals(this.modelId)) {
      return super.hashCode();
    }
    return this.modelId.hashCode();
  }
}