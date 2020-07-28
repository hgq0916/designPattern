package com.mashibing.designpattern.factory.Factorymethod;

public class BroomFactory {

  Moveable create(){
    return new Broom();
  }

}
