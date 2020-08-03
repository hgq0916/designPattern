package com.mashibing.designpattern.proxy.v3;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.proxy.v2.TimeTank
 * @Description: 使用聚合实现时间统计
 * @date 2020/8/3 14:21
 */
public class TimeProxy implements Moveable{

  Moveable moveable;

  public TimeProxy(Moveable moveable){
    this.moveable = moveable;
  }

  public void move() {
    long time1 = System.currentTimeMillis();
    moveable.move();
    long time2 = System.currentTimeMillis();
    System.out.println("耗时："+(time2-time1));
  }
}
