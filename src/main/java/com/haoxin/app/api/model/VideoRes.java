package com.haoxin.app.api.model;

import java.util.Date;

public class VideoRes
{

  private String language;

  private String subtitle;

  private String director;

  private String actor;

  private String region;

  private String length;

  private Date releaseDate;

  private String amount;

  private String size;

  public String getLanguage()
  {
    return this.language;
  }

  public void setLanguage(String language)
  {
    this.language = language;
  }

  public String getSubtitle()
  {
    return this.subtitle;
  }

  public void setSubtitle(String subtitle)
  {
    this.subtitle = subtitle;
  }

  public String getDirector()
  {
    return this.director;
  }

  public void setDirector(String director)
  {
    this.director = director;
  }

  public String getActor()
  {
    return this.actor;
  }

  public void setActor(String actor)
  {
    this.actor = actor;
  }

  public String getRegion()
  {
    return this.region;
  }

  public void setRegion(String region)
  {
    this.region = region;
  }

  public String getLength()
  {
    return this.length;
  }

  public void setLength(String length)
  {
    this.length = length;
  }

  public Date getReleaseDate()
  {
    return this.releaseDate;
  }

  public void setReleaseDate(Date releaseDate)
  {
    this.releaseDate = releaseDate;
  }

  public String getAmount()
  {
    return this.amount;
  }

  public void setAmount(String amount)
  {
    this.amount = amount;
  }

  public String getSize()
  {
    return this.size;
  }

  public void setSize(String size)
  {
    this.size = size;
  }
}