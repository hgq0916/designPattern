package com.mashibing.designpattern.proxy.v1;

import java.util.Random;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.proxy.v1.Tank
 * @Description: 修改源代码实现时间统计
 * @date 2020/8/3 11:58
 */
public class Tank implements Moveable {

  @Override
  public void move() {
    long time1 = System.currentTimeMillis();
    System.out.println("tank move chachacha....");
    try {
      Thread.sleep(new Random().nextInt(10000));
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    long time2 = System.currentTimeMillis();
    System.out.println("耗时："+(time2-time1));
  }
}
