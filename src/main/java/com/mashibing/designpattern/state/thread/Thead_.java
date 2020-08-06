package com.mashibing.designpattern.state.thread;

public class Thead_ {

  TheadState_ state;

  public void move(Action action){
    state.move(action);
  }

  public void run(){
    state.run();
  }

}
