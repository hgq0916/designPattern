package com.mashibing.designpattern.observer;

public class Dad implements Observer {

  @Override
  public void actionPerformed(CryEvent cryEvent) {
    System.out.println("dad actionPerformed");
    System.out.println("dad:"+cryEvent);
  }
}
