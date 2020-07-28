package com.mashibing.designpattern.factory.simpleFactory;

public class SimpleFactoryTest {

  public static void main(String[] args) {
    /*Car car = new Car();
    car.go();
    Bread bread = new Bread();
    bread.printName();
    Ak47 ak47 = new Ak47();
    ak47.shoot();*/
    Car car = SimpleFactory.getInstance().createCar();
    car.go();
    Bread bread = SimpleFactory.getInstance().createBread();
    bread.printName();
    Ak47 ak47 = SimpleFactory.getInstance().createAk47();
    ak47.shoot();

  }

}
