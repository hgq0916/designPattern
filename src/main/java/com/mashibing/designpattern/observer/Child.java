package com.mashibing.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Child {

  private List<Observer> observerList = new ArrayList<>();

  {
    Dad dad = new Dad();
    Dog dog = new Dog();
    addObserver(dad);
    addObserver(dog);
  }

  public void addObserver(Observer observer){
    observerList.add(observer);
  }

  public void removeObserver(Observer observer){
    observerList.remove(observer);
  }

  private boolean cry = false;

  public void wakeup(){
    cry = true;
    System.out.println("child is wakeup,wuwuwuw...");
    CryEvent cryEvent = new CryEvent(this);
    for(Observer observer : observerList){
      observer.actionPerformed(cryEvent);
    }
  }

}
