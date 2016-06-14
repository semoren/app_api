package com.haoxin.app.api.model;

import java.io.Serializable;

public class ProductMark implements Serializable
{
  private static final long serialVersionUID = 1L;

  private Integer firstOptionCount = Integer.valueOf(0);

  private String percentageFirstOption = "0%";

  private Integer secondOptionCount = Integer.valueOf(0);

  private String percentageSecondOption = "0%";

  private Integer thirdOptionCount = Integer.valueOf(0);

  private String percentageThirdOption = "0%";

  private Integer fourthOptionCount = Integer.valueOf(0);

  private String percentageFourthOption = "0%";

  private Integer fifthOPtionCount = Integer.valueOf(0);

  private String percentageFifthOPtion = "0%";

  private Integer totalMark = Integer.valueOf(2);

  private Integer totalNumber = Integer.valueOf(0);

  public Integer getFirstOptionCount()
  {
    return this.firstOptionCount;
  }

  public void setFirstOptionCount(Integer firstOptionCount)
  {
    this.firstOptionCount = firstOptionCount;
  }

  public Integer getSecondOptionCount()
  {
    return this.secondOptionCount;
  }

  public void setSecondOptionCount(Integer secondOptionCount)
  {
    this.secondOptionCount = secondOptionCount;
  }

  public Integer getThirdOptionCount()
  {
    return this.thirdOptionCount;
  }

  public void setThirdOptionCount(Integer thirdOptionCount)
  {
    this.thirdOptionCount = thirdOptionCount;
  }

  public Integer getFourthOptionCount()
  {
    return this.fourthOptionCount;
  }

  public void setFourthOptionCount(Integer fourthOptionCount)
  {
    this.fourthOptionCount = fourthOptionCount;
  }

  public Integer getFifthOPtionCount()
  {
    return this.fifthOPtionCount;
  }

  public void setFifthOPtionCount(Integer fifthOPtionCount)
  {
    this.fifthOPtionCount = fifthOPtionCount;
  }

  public Integer getTotalMark()
  {
    return this.totalMark;
  }

  public void setTotalMark(Integer totalMark)
  {
    this.totalMark = totalMark;
  }

  public Integer getTotalNumber()
  {
    return this.totalNumber;
  }

  public void setTotalNumber(Integer totalNumber)
  {
    this.totalNumber = totalNumber;
  }

  public String getPercentageFirstOption()
  {
    return this.percentageFirstOption;
  }

  public void setPercentageFirstOption(String percentageFirstOption)
  {
    this.percentageFirstOption = percentageFirstOption;
  }

  public String getPercentageSecondOption()
  {
    return this.percentageSecondOption;
  }

  public void setPercentageSecondOption(String percentageSecondOption)
  {
    this.percentageSecondOption = percentageSecondOption;
  }

  public String getPercentageThirdOption()
  {
    return this.percentageThirdOption;
  }

  public void setPercentageThirdOption(String percentageThirdOption)
  {
    this.percentageThirdOption = percentageThirdOption;
  }

  public String getPercentageFourthOption()
  {
    return this.percentageFourthOption;
  }

  public void setPercentageFourthOption(String percentageFourthOption)
  {
    this.percentageFourthOption = percentageFourthOption;
  }

  public String getPercentageFifthOPtion()
  {
    return this.percentageFifthOPtion;
  }

  public void setPercentageFifthOPtion(String percentageFifthOPtion)
  {
    this.percentageFifthOPtion = percentageFifthOPtion;
  }
}