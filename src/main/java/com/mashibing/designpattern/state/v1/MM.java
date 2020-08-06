package com.mashibing.designpattern.state.v1;

public class MM {

  enum MMState {HAPPY,SAD};

  MMState mmState;

  public void smile(){
    //根据不同状态，灿烂的笑，苦笑
  }

  public void cry(){
    //激动地哭
    //伤心地哭
  }

  public void say(){
    //欢快地说
    //恶言恶语
  }

}
