package com.mashibing.designpattern.state.car;

public class CarRunningState implements CarState {

  private Car car;

  public CarRunningState(Car car) {
    this.car = car;
  }

  @Override
  public void move(Action action) {
    if("stop".equals(action.msg)){
      car.carState = new CarStopState(car);
    }
  }
}
