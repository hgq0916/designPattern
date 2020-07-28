package com.mashibing.designpattern.factory.simpleFactory;

public class SimpleFactory {

  private SimpleFactory(){}

  private static SimpleFactory simpleFactory = new SimpleFactory();

  public static SimpleFactory getInstance(){
    return simpleFactory;
  }

  public Car createCar(){
    /**
     * 工厂的好处：可以控制产品的生产过程，比如权限控制，日志
     */
    System.out.println("car created ...");
    return new Car();
  }

  public Bread createBread(){
    /**
     * 工厂的好处：可以控制产品的生产过程，比如权限控制，日志
     */
    System.out.println("bread created ...");
    return new Bread();
  }

  public Ak47 createAk47(){
    /**
     * 工厂的好处：可以控制产品的生产过程，比如权限控制，日志
     */
    System.out.println("ak47 created ...");
    return new Ak47();
  }

}
