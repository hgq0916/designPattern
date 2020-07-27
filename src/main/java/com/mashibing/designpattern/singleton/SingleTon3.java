package com.mashibing.designpattern.singleton;

/**
 * 懒汉式，方法加锁，可以解决线程安全问题，但是效率较低，因为在第一次创建对象后，每次调用方法都会加锁，在某一时刻只有一个线程
 * 能执行该方法
 */
public class SingleTon3 {

  private SingleTon3(){}

  private static SingleTon3 singleTon3;

  public static synchronized SingleTon3 getInstance(){
    if(singleTon3 == null){
      try {
        Thread.sleep(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      singleTon3 = new SingleTon3();
    }
    return singleTon3;
  }

  public static void main(String[] args) {
    for(int i=0;i<100;i++){
      new Thread(()->{
        SingleTon3 instance = SingleTon3.getInstance();
        System.out.println(instance.hashCode());
      }).start();
    }

  }

}
