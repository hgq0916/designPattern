package com.mashibing.designpattern.singleton;

/**
 * 懒汉式，双重锁检验DCL，可以解决线程安全问题，不过要加volatile防止指令重排序
 */
public class SingleTon5 {

  private SingleTon5(){}

  private static volatile SingleTon5 singleTon5;

  public static SingleTon5 getInstance(){
    /**
     * 在多线程环境下，第一个线程判断singleTon5为空，获取锁，并初始化对象，第二个线程也进来了，判断singleTon5为空，然后等待锁，当第一个线程释放锁后，
     * 第二个线程获取锁，然后判断singleTon5不为空，则直接返回对象
     * 但是，由于jvm的指令重排序，创建对象的过程有可能不是顺序执行；
     * 创建对象的过程包括分配堆内存，初始化静态成员，然后返回对象指针，
     * 在实际运行中，这三步可能不是顺序执行，比如分配堆内存，然后返回对象指针，初始化静态成员，
     * 这个时候刚好有进程进来了，判断singleTon5不为空，直接返回对象，但这个对象还没有完成初始化就被线程使用了，可能会引发异常
     * 因此，必须加volatile
     */
    if(singleTon5 == null){
      synchronized (SingleTon5.class){
        if(singleTon5 == null){
          singleTon5 = new SingleTon5();
        }
      }
    }
    return singleTon5;
  }

  public static void main(String[] args) {
    for(int i=0;i<100;i++){
      new Thread(()->{
        SingleTon5 instance = SingleTon5.getInstance();
        System.out.println(instance.hashCode());
      }).start();
    }
  }

}
