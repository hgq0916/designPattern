package com.mashibing.designpattern.state.v2;

public class MM {

  MMState mmState;

  public void smile(){
    mmState.smile();
  }

  public void cry(){
    mmState.cry();
  }

  public void say(){
    mmState.say();
  }

}
