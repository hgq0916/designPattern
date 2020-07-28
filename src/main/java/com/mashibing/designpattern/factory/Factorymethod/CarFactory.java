package com.mashibing.designpattern.factory.Factorymethod;

public class CarFactory {

  Moveable create(){
    return new Car();
  }

}
