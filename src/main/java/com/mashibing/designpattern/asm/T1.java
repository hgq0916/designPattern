package com.mashibing.designpattern.asm;

public class T1 {

  int num = 0;

  public void m(){
    /*int j = 1;
    System.out.println(j);*/
    int i =0;
    i = i++;
    System.out.println("i="+i);
  }

  public static void main(String[] args) {
    new T1().m();
  }

}
