package com.haoxin.app.api.model;

public class ResInfo
{

  private Integer type;

  private String typeName;

  private String url;

  public ResInfo()
  {
    setType(Integer.valueOf(0));
    setTypeName("undifend");
    setUrl("undifend");
  }

  public Integer getType()
  {
    return this.type;
  }
  public void setType(Integer type) {
    this.type = type;
  }
  public String getTypeName() {
    return this.typeName;
  }
  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }
  public String getUrl() {
    return this.url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  public boolean equals(Object o)
  {
    if (!(o instanceof ResInfo)) {
      return false;
    }
    ResInfo obj = (ResInfo)o;
    if ((obj.getType() == this.type) && (obj.getTypeName() == this.typeName) && (obj.getUrl() == this.url)) {
      return true;
    }
    return false;
  }

  public int hashCode()
  {
    int result = 17;
    result = 37 * result + this.type.hashCode();
    result = 37 * result + this.typeName.hashCode();
    result = 37 * result + this.url.hashCode();
    return result;
  }
}