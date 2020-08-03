package com.mashibing.designpattern.proxy.v3;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.proxy.v1.ProxyTest
 * @Description: TODO
 * @date 2020/8/3 14:17
 */
public class ProxyTest {

  public static void main(String[] args) {
    //Moveable tank = new TimeProxy(new LogProxy(new Tank()));
    Moveable tank = new LogProxy(new TimeProxy(new Tank()));
    tank.move();
  }

}
