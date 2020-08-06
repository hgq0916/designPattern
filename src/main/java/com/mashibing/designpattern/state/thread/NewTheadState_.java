package com.mashibing.designpattern.state.thread;

public class NewTheadState_ implements TheadState_ {

  private Thead_ thead_;

  public NewTheadState_(Thead_ thead_){
    this.thead_ = thead_;
  }

  @Override
  public void move(Action action) {
    if(action.msg.equals("start")){
      thead_.state = new RunTheadState();
    }
  }

  @Override
  public void run() {
    //运行
  }
}
