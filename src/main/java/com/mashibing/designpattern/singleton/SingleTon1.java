package com.mashibing.designpattern.singleton;

/**
 * 饿汉式,jvm保证一个类只会被加载到内存一次，当类被加载到内存时，只有一个线程可以执行初始化方法，因此是线程安全的
 * 缺点：当类被加载到内存会立即初始化
 */
public class SingleTon1 {

  private SingleTon1(){}

  private static SingleTon1 singleTon1 = new SingleTon1();

  public static SingleTon1 getInstance(){
    return singleTon1;
  }

  public static void main(String[] args) {
    for(int i=0;i<100;i++){
      new Thread(()->{
        SingleTon1 instance = SingleTon1.getInstance();
        System.out.println(instance.hashCode());
      }).start();
    }

  }

}
