package com.makers.smile;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Smile {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private Boolean isCrying = null;

  private Boolean isLaughing = null;

  public Smile() {}

  public Smile(Boolean isCrying, Boolean isLaughing) {
    this.isCrying = isCrying;
    this.isLaughing = isLaughing;
  }

  public Long getId() {
    return this.id;
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
