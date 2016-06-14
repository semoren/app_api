package com.haoxin.app.api.model;

public class FrameInfo
{

  private String frameId;

  private boolean defaulted;

  private String resTypeId;

  private String parentTypeId;

  public String getFrameId()
  {
    return this.frameId;
  }

  public void setFrameId(String frameId)
  {
    this.frameId = frameId;
  }

  public boolean getDefaulted()
  {
    return this.defaulted;
  }

  public void setDefaulted(boolean defaulted)
  {
    this.defaulted = defaulted;
  }

  public String getResTypeId()
  {
    return this.resTypeId;
  }

  public void setResTypeId(String resTypeId)
  {
    this.resTypeId = resTypeId;
  }

  public String getParentTypeId()
  {
    return this.parentTypeId;
  }

  public void setParentTypeId(String parentTypeId)
  {
    this.parentTypeId = parentTypeId;
  }

  public boolean equals(Object obj)
  {
    FrameInfo frameInfo = (FrameInfo)obj;
    if ((getResTypeId() != null) && (frameInfo.getResTypeId() != null)) {
      return getResTypeId().equals(frameInfo.getResTypeId());
    }
    return false;
  }

  public int hashCode()
  {
    if (getResTypeId() != null) {
      return getResTypeId().hashCode();
    }
    return 0;
  }
}