package com.mashibing.designpattern.proxy.v3;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.proxy.v3.LogProxy
 * @Description: TODO
 * @date 2020/8/3 14:26
 */
public class LogProxy implements Moveable {

  Moveable moveable;

  public LogProxy(Moveable moveable){
    this.moveable = moveable;
  }

  @Override
  public void move() {
    System.out.println("call moveable begin...");
    moveable.move();
    System.out.println("call moveable end...");
  }
}
