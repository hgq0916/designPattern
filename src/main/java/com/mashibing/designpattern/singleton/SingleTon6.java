package com.mashibing.designpattern.singleton;

/**
 * 使用静态内部类,可以实现延迟加载，又可以解决线程安全问题
 * 当外部类被加载时，静态内部类不会被加载，只有使用静态内部类的时候才会被加载，而jvm可以保证一个类只会被加载一次，因此是线程安全的
 */
public class SingleTon6 {

  private SingleTon6(){}

  private static class SingleTon6Holder {
    private static SingleTon6 INSTANCE = new SingleTon6();
  }

  public static SingleTon6 getInstance(){
    return SingleTon6Holder.INSTANCE;
  }

  public static void main(String[] args) {
    for(int i=0;i<100;i++){
      new Thread(()->{
        SingleTon6 instance = SingleTon6.getInstance();
        System.out.println(instance.hashCode());
      }).start();
    }
  }

}
