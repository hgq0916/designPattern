package com.mashibing.designpattern.state.v2;

public class MMSadState implements MMState {

  @Override
  public void smile() {
    //苦笑
  }

  @Override
  public void cry() {
    //伤心地哭
  }

  @Override
  public void say() {
    //恶言恶语
  }
}
