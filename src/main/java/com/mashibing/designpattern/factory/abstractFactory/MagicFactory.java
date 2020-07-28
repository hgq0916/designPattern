package com.mashibing.designpattern.factory.abstractFactory;

public class MagicFactory implements AbstractFactory {

  @Override
  public Food createFood() {
    return new Mushroom();
  }

  @Override
  public Moveable createMoveable() {
    return new Broom();
  }

  @Override
  public Weapon createWeanpon() {
    return new MagicWand();
  }
}
