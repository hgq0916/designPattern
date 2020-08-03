package com.mashibing.designpattern.spring.v1;

import java.util.Random;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.proxy.v1.Tank
 * @Description: TODO
 * @date 2020/8/3 11:58
 */
public class Tank {

  public void move() {
    System.out.println("tank move chachacha....");
    try {
      Thread.sleep(new Random().nextInt(10000));
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
