package com.mashibing.designpattern.state.car;

public class CarOpenState implements CarState {

  private Car car;

  public CarOpenState(Car car) {
    this.car = car;
  }

  @Override
  public void move(Action action) {
    if(action.msg.equals("close")){
      car.carState = new CarCloseState(car);
    }
  }
}
