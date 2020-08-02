package com.mashibing.designpattern.observer;

public class Dog implements Observer {

  @Override
  public void actionPerformed(CryEvent cryEvent) {
    System.out.println("dog wangwangwang...");
    System.out.println("dog:"+cryEvent);
  }
}
