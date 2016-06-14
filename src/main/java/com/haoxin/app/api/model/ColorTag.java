package com.haoxin.app.api.model;

import java.util.Date;

public class ColorTag
{

  private String context;

  private String color;

  private String bgcolor;

  private String borderColor;

  private Date createTime;

  public String getContext()
  {
    return this.context;
  }

  public void setContext(String context)
  {
    this.context = context;
  }

  public String getColor()
  {
    return this.color;
  }

  public String getBgcolor()
  {
    return this.bgcolor;
  }

  public String getBorderColor()
  {
    return this.borderColor;
  }

  public void setColor(String color)
  {
    this.color = color;
  }

  public void setBgcolor(String bgcolor)
  {
    this.bgcolor = bgcolor;
  }

  public void setBorderColor(String borderColor)
  {
    this.borderColor = borderColor;
  }

  public Date getCreateTime()
  {
    return this.createTime;
  }

  public void setCreateTime(Date createTime)
  {
    this.createTime = createTime;
  }
}