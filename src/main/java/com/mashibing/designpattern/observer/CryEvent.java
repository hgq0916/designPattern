package com.mashibing.designpattern.observer;

import java.util.Date;

public class CryEvent implements Event<Child> {

  private Child child;

  private long timestamp;

  public CryEvent(Child child){
    this.child = child;
    this.timestamp = new Date().getTime();
  }

  @Override
  public Child getSource() {
    return child;
  }

  @Override
  public String toString() {
    return "CryEvent{" +
        "child=" + child +
        ", timestamp=" + timestamp +
        '}';
  }
}
