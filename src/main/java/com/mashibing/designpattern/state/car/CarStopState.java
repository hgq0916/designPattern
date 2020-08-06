package com.mashibing.designpattern.state.car;

public class CarStopState implements CarState {

  private Car car;

  public CarStopState(Car car) {
    this.car = car;
  }

  @Override
  public void move(Action action) {
    if("open".equals(action.msg)){
      car.carState = new CarOpenState(car);
    }else if("running".equals(action.msg)){
      car.carState = new CarRunningState(car);
    }
  }
}
