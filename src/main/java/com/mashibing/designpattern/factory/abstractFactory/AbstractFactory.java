package com.mashibing.designpattern.factory.abstractFactory;

public interface AbstractFactory {

  Food createFood();

  Moveable createMoveable();

  Weapon createWeanpon();

}
