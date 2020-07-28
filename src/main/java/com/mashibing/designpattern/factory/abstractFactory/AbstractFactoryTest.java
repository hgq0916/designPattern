package com.mashibing.designpattern.factory.abstractFactory;

public class AbstractFactoryTest {

  public static void main(String[] args) {
    //AbstractFactory factory = new ModernFactory();
    AbstractFactory factory = new MagicFactory();
    Food food = factory.createFood();
    food.printName();
    Moveable moveable = factory.createMoveable();
    moveable.go();
    Weapon weanpon = factory.createWeanpon();
    weanpon.shoot();
  }

}
