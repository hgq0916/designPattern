package com.mashibing.designpattern.proxy.v5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeInvocationHanlder implements InvocationHandler {

  Moveable moveable;

  public TimeInvocationHanlder(Moveable moveable){
    this.moveable = moveable;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("moveable call begin");
    long time1 = System.currentTimeMillis();

    Object o = method.invoke(moveable, args);

    long time2 = System.currentTimeMillis();
    System.out.println("时间耗时："+(time2-time1));
    System.out.println("moveable call end");

    return o;
  }

}
