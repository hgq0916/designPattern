package com.mashibing.designpattern.factory.abstractFactory;

public class Broom implements Moveable {

  @Override
  public void go() {
    System.out.println("broom fly ...");
  }
}
