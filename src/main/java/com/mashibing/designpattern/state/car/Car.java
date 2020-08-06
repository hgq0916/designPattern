package com.mashibing.designpattern.state.car;

public class Car {

  CarState carState;

  public void open(){
    carState.move(new Action("open"));
  }

  public void close(){
    carState.move(new Action("close"));
  }

  public void running(){
    carState.move(new Action("running"));
  }

  public void stop(){
    carState.move(new Action("stop"));
  }

  public CarState getCarState() {
    return carState;
  }

  public void setCarState(CarState carState) {
    this.carState = carState;
  }
}
