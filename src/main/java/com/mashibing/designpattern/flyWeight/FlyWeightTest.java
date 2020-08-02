package com.mashibing.designpattern.flyWeight;

public class FlyWeightTest {

  public static void main(String[] args) {
    String str1 = "abc";
    String str2 = "abc";
    String str3 = new String("abc");
    String str4 = new String("abc");

    System.out.println(str1 == str2);
    System.out.println(str2 == str3);
    System.out.println(str3 == str4);
    System.out.println(str3.intern() == str1);
    System.out.println(str3.intern() == str4.intern());
  }

}
