package com.makers.smile;

public class SmileDTO {
  private Boolean isCrying;
  private Boolean isLaughing;

  public SmileDTO () {}

  public SmileDTO(Boolean isCrying, Boolean isLaughing) {
    this.isCrying = isCrying;
    this.isLaughing = isLaughing;
  }

  public Boolean getIsCrying() {
    return this.isCrying;
  }

  public void setIsCrying(Boolean isCrying) {
    this.isCrying = isCrying;
  }

  public Boolean getIsLaughing() {
    return this.isLaughing;
  }

  public void setIsLaughing(Boolean isLaughing) {
    this.isLaughing = isLaughing;
  }
}
