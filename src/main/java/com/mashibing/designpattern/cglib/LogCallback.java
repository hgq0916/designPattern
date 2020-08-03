package com.mashibing.designpattern.cglib;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.InvocationHandler;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class LogCallback implements MethodInterceptor {

  public void before(){
    System.out.println("method  invoked begin ...");
  }

  public void after(){
    System.out.println("method  invoked end ...");
  }

  @Override
  public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
      throws Throwable {
    System.out.println(method);
    System.out.println(methodProxy);
    before();
    Object result = methodProxy.invokeSuper(o, objects);
    //Object result = method.invoke(o,objects);
    after();
    //如果把before和after的逻辑放在配置文件中指定，就可以很灵活的切换代理逻辑
    return result;
  }
}
