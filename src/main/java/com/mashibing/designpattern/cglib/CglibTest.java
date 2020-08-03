package com.mashibing.designpattern.cglib;

import net.sf.cglib.proxy.Enhancer;

public class CglibTest {

  public static void main(String[] args) {
    Enhancer enhancer = new Enhancer();
    enhancer.setSuperclass(Tank.class);
    enhancer.setCallback(new LogCallback());
    Tank tank = (Tank) enhancer.create();
    tank.move();
  }

}
