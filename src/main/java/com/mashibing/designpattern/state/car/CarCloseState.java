package com.mashibing.designpattern.state.car;

public class CarCloseState implements CarState {

  private Car car;

  public CarCloseState(Car car){
    this.car = car;
  }

  @Override
  public void move(Action action) {
    if("open".equals(action.msg)){
      car.carState = new CarOpenState(car);
    }
  }
}
