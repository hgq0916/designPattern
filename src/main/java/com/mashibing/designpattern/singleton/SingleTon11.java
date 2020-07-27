package com.mashibing.designpattern.singleton;
/**
 * 饿汉式,jvm保证一个类只会被加载到内存一次，当类被加载到内存时，只有一个线程可以执行初始化方法，因此是线程安全的
 * 缺点：当类被加载到内存会立即初始化
 */
public class SingleTon11 {

  private SingleTon11(){}

  private static SingleTon11 singleTon11;

  static {
    singleTon11 = new SingleTon11();
  }

  public static SingleTon11 getInstance(){
    return singleTon11;
  }

  public static void main(String[] args) {
    for(int i=0;i<100;i++){
      new Thread(()->{
        SingleTon11 instance = SingleTon11.getInstance();
        System.out.println(instance.hashCode());
      }).start();
    }
  }

}
