package com.mashibing.designpattern.singleton;

/**
 * 懒汉式，有线程安全问题
 */
public class SingleTon2 {

  private static SingleTon2 singleTon2;

  private SingleTon2(){}

  public static SingleTon2 getInstance(){
    /**
     * 在多线程环境下，当第一个线程判断singleTon2为空，然后会创建对象，再创建对象还没有完成赋值时，第二个线程进来了，判断
     * singleTon2仍然为空，然后也会去创建对象，这样就导致对象被创建了多次
     */
    if(singleTon2 == null){
      try {
        Thread.sleep(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      singleTon2 = new SingleTon2();
    }
    return singleTon2;
  }


  public static void main(String[] args) {
    for(int i=0;i<100;i++){
      new Thread(()->{
        SingleTon2 instance = SingleTon2.getInstance();
        System.out.println(instance.hashCode());
      }).start();
    }

  }
}
