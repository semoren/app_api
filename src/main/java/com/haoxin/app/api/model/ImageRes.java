package com.haoxin.app.api.model;

import java.util.Date;

public class ImageRes
{

  private String amount;

  private String size;

  private String region;

  private Date releaseDate;

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
}