package com.mashibing.designpattern.singleton;

/**
 * 懒汉式，在初始化方法外面加锁，可以提高效率，减少加锁的次数，但是仍然有线程安全问题
 */
public class SingleTon4 {

  private SingleTon4(){}

  private static SingleTon4 singleTon4;

  public static SingleTon4 getInstance(){
    /**
     * 在多线程环境下，当第一个线程判断singleTon4为空，则尝试获取锁，获取锁后对singleTon4进行初始化，此时第二个线程进来了，
     * 判断singleTon4仍然为空，则等待锁，第一个线程释放锁之后，第二个线程开始创建对象，所以会导致创建多个对象
     */
    if(singleTon4 == null){
      try {
        Thread.sleep(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      synchronized (SingleTon4.class){
        singleTon4 = new SingleTon4();
      }
    }
    return singleTon4;
  }

  public static void main(String[] args) {
    for(int i=0;i<100;i++){
      new Thread(()->{
        SingleTon4 instance = SingleTon4.getInstance();
        System.out.println(instance.hashCode());
      }).start();
    }
  }

}
