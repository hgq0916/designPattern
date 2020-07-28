package com.mashibing.designpattern.factory.Factorymethod;

public class TrainFactory {

  Moveable create(){
    return new Train();
  }

}
