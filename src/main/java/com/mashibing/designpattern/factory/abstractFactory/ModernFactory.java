package com.mashibing.designpattern.factory.abstractFactory;

public class ModernFactory implements AbstractFactory {

  @Override
  public Food createFood() {
    return new Bread();
  }

  @Override
  public Moveable createMoveable() {
    return new Car();
  }

  @Override
  public Weapon createWeanpon() {
    return new Ak47();
  }

}
