package com.mashibing.designpattern.templateMethod;

public abstract class F1 {

  void fun(){
    f1();
    f2();
  }

  protected abstract void f2();


  protected abstract void f1();


}
