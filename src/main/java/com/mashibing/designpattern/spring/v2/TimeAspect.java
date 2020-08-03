package com.mashibing.designpattern.spring.v2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TimeAspect {

  @Before("execution(void com.mashibing.designpattern.spring.v2.Tank.*(..))")
  public void before(){
    System.out.println("TimeAspect before");
  }

  @After("execution(void com.mashibing.designpattern.spring.v2.Tank.*(..))")
  public void after(){
    System.out.println("TimeAspect after");
  }

}
