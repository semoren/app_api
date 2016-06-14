package com.haoxin.app.api.model;

import java.util.Date;

public class ThemeRes
{

  private String ver;

  private Integer age;

  private String language;

  private String region;

  private Date releaseDate;

  private String color;

  public String getVer()
  {
    return this.ver;
  }

  public void setVer(String ver)
  {
    this.ver = ver;
  }

  public Integer getAge()
  {
    return this.age;
  }

  public void setAge(Integer age)
  {
    this.age = age;
  }

  public String getLanguage()
  {
    return this.language;
  }

  public void setLanguage(String language)
  {
    this.language = language;
  }

  public String getRegion()
  {
    return this.region;
  }

  public void setRegion(String region)
  {
    this.region = region;
  }

  public Date getReleaseDate()
  {
    return this.releaseDate;
  }

  public void setReleaseDate(Date releaseDate)
  {
    this.releaseDate = releaseDate;
  }

  public String getColor()
  {
    return this.color;
  }

  public void setColor(String color)
  {
    this.color = color;
  }
}