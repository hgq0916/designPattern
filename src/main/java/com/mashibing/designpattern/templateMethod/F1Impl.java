package com.mashibing.designpattern.templateMethod;

public class F1Impl extends F1 {

  @Override
  protected void f2() {
    System.out.println("f2");
  }

  @Override
  protected void f1() {
    System.out.println("f1");
  }

  public static void main(String[] args) {
    F1 f = new F1Impl();
    f.fun();
  }
}
