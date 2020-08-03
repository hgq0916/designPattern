package com.mashibing.designpattern.proxy.v2;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.proxy.v2.TimeTank
 * @Description: 通过继承实现时间统计
 * @date 2020/8/3 14:21
 */
public class TimeTank extends Tank {

  @Override
  public void move() {
    long time1 = System.currentTimeMillis();
    super.move();
    long time2 = System.currentTimeMillis();
    System.out.println("耗时："+(time2-time1));
  }
}
