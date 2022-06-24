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

  private Boolean isCrying;

  private Boolean isLaughing;

  public Smile() {}

  public Smile(Boolean crying, Boolean laughing) {
    this.isCrying = crying;
    this.isLaughing = laughing;
  }

  public Long getId() {
    return this.id;
  }

  public Boolean getIsCrying() {
    return this.isCrying;
  }

  public void setIsCrying(Boolean crying) {
    this.isCrying = crying;
  }

  public Boolean getIsLaughing() {
    return this.isLaughing;
  }

  public void setIsLaughing(Boolean laughing) {
    this.isLaughing = laughing;
  }
  
}
