package com.mashibing.designpattern.strategy;

import java.util.Arrays;

public class SortTest {

  public static void main(String[] args) {
   /* int arr[] = new int[]{4,3,6,1,8};
    System.out.println(Arrays.toString(arr));
    Sorter.sort(arr);
    System.out.println(Arrays.toString(arr));*/
    Cat arr[] = new Cat[]{new Cat(3,3),new Cat(5,5),new Cat(1,1)};
    System.out.println(Arrays.toString(arr));
    Sorter.sort(arr);
    System.out.println(Arrays.toString(arr));
  }

}
