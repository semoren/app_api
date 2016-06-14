package com.haoxin.app.api.model;

import java.util.Date;

public class ProductStatisticsInfo
{

  private Integer dayVisitCount;

  private Integer dayDownloadCount;

  private Date day;

  private Integer weekVisitCount;

  private Integer weekDownloadCount;

  private Integer week;

  private Integer monthVisitCount;

  private Integer monthDownloadCount;

  private Integer month;

  public Integer getDayVisitCount()
  {
    return this.dayVisitCount;
  }

  public void setDayVisitCount(Integer dayVisitCount)
  {
    this.dayVisitCount = dayVisitCount;
  }

  public Integer getDayDownloadCount()
  {
    return this.dayDownloadCount;
  }

  public void setDayDownloadCount(Integer dayDownloadCount)
  {
    this.dayDownloadCount = dayDownloadCount;
  }

  public Date getDay()
  {
    return this.day;
  }

  public void setDay(Date day)
  {
    this.day = day;
  }

  public Integer getWeekVisitCount()
  {
    return this.weekVisitCount;
  }

  public void setWeekVisitCount(Integer weekVisitCount)
  {
    this.weekVisitCount = weekVisitCount;
  }

  public Integer getWeekDownloadCount()
  {
    return this.weekDownloadCount;
  }

  public void setWeekDownloadCount(Integer weekDownloadCount)
  {
    this.weekDownloadCount = weekDownloadCount;
  }

  public Integer getWeek()
  {
    return this.week;
  }

  public void setWeek(Integer week)
  {
    this.week = week;
  }

  public Integer getMonthVisitCount()
  {
    return this.monthVisitCount;
  }

  public void setMonthVisitCount(Integer monthVisitCount)
  {
    this.monthVisitCount = monthVisitCount;
  }

  public Integer getMonthDownloadCount()
  {
    return this.monthDownloadCount;
  }

  public void setMonthDownloadCount(Integer monthDownloadCount)
  {
    this.monthDownloadCount = monthDownloadCount;
  }

  public Integer getMonth()
  {
    return this.month;
  }

  public void setMonth(Integer month)
  {
    this.month = month;
  }
}