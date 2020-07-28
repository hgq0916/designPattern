package com.mashibing.designpattern.factory.Factorymethod;

public class Train implements Moveable {

  @Override
  public void go() {
    System.out.println("train run...");
  }
}
