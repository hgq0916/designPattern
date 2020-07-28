package com.mashibing.designpattern.factory.Factorymethod;

public class FactoryMethodTest {

  public static void main(String[] args) {
    Moveable moveable = new CarFactory().create();
    moveable.go();
    Moveable moveable1 = new BroomFactory().create();
    moveable1.go();
    Moveable moveable2 = new TrainFactory().create();
    moveable2.go();
  }

}
