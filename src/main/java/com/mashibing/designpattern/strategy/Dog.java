package com.mashibing.designpattern.strategy;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.strategy.Dog
 * @Description: TODO
 * @date 2020/7/28 15:31
 */
public class Dog {

  int food;

  public Dog(int food) {
    this.food = food;
  }

  public int getFood() {
    return food;
  }

  public void setFood(int food) {
    this.food = food;
  }

  @Override
  public String toString() {
    return "Dog{" +
        "food=" + food +
        '}';
  }
}
