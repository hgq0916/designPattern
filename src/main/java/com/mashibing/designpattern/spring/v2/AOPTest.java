package com.mashibing.designpattern.spring.v2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("aop-auto.xml");
    Tank tank = (Tank) context.getBean("tank");
    //tank类实现接口，则生成接口的代理对象，否则使用cglib代理生成tank类的子类
    tank.move();
  }

}
