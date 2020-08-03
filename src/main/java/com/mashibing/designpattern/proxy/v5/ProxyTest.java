package com.mashibing.designpattern.proxy.v5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.proxy.v1.ProxyTest
 * @Description: TODO
 * @date 2020/8/3 14:17
 */
public class ProxyTest {

  public static void main(String[] args) {
    //Moveable tank = new TimeProxy(new LogProxy(new Tank()));
    System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
    Tank tank = new Tank();
    Moveable moveable = (Moveable) Proxy.newProxyInstance(Moveable.class.getClassLoader(),
        new Class[]{Moveable.class},new TimeInvocationHanlder(tank) );
    moveable.move();
  }

}
