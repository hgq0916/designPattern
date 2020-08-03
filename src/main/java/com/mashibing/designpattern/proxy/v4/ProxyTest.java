package com.mashibing.designpattern.proxy.v4;

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
    Tank tank = new Tank();
    Moveable moveable = (Moveable) Proxy.newProxyInstance(Moveable.class.getClassLoader(),
        new Class[]{Moveable.class}, new InvocationHandler() {
          @Override
          public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("moveable call begin");
            long time1 = System.currentTimeMillis();

            Object o = method.invoke(tank, args);

            long time2 = System.currentTimeMillis();
            System.out.println("时间耗时："+(time2-time1));
            System.out.println("moveable call end");

            return o;
          }
        });
    moveable.move();
  }

}
