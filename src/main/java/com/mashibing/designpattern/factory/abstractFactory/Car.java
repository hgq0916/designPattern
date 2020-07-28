package com.mashibing.designpattern.factory.abstractFactory;

public class Car implements Moveable {

  @Override
  public void go() {
    System.out.println("car run...");
  }
}
