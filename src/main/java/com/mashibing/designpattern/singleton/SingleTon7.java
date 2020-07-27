package com.mashibing.designpattern.singleton;

/**
 * 使用枚举，线程安全，还可以防止反序列化，因为当反序列化的时候，通过反射可以创建一个类的对象，但是反序列化的时候，
 * 被反序列化的只是枚举的一个属性，所以返回的枚举对象总是同一个
 */
public enum SingleTon7 {

  INSTANCE;

  public void m(){}

  public static void main(String[] args) {
    for(int i=0;i<100;i++){
      new Thread(()->{
        SingleTon7 instance = SingleTon7.INSTANCE;
        System.out.println(instance.hashCode());
      }).start();
    }
  }

}
