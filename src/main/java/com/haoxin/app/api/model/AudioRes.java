package com.haoxin.app.api.model;

import java.util.Date;

public class AudioRes
{

  private String language;

  private String singer;

  private String singerType;

  private String company;

  private Date releaseDate;

  private String amount;

  private String region;

  public String getLanguage()
  {
    return this.language;
  }

  public void setLanguage(String language)
  {
    this.language = language;
  }

  public String getSinger()
  {
    return this.singer;
  }

  public void setSinger(String singer)
  {
    this.singer = singer;
  }

  public String getSingerType()
  {
    return this.singerType;
  }

  public void setSingerType(String singerType)
  {
    this.singerType = singerType;
  }

  public String getCompany()
  {
    return this.company;
  }

  public void setCompany(String company)
  {
    this.company = company;
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

  public String getRegion()
  {
    return this.region;
  }

  public void setRegion(String region)
  {
    this.region = region;
  }
}