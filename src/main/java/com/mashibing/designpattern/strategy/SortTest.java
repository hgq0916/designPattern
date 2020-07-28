package com.mashibing.designpattern.strategy;

import java.util.Arrays;

public class SortTest {

  public static void main(String[] args) {
   /* int arr[] = new int[]{4,3,6,1,8};
    System.out.println(Arrays.toString(arr));
    Sorter.sort(arr);
    System.out.println(Arrays.toString(arr));*/
    /*Cat arr[] = new Cat[]{new Cat(3,3),new Cat(5,5),new Cat(1,1)};
    System.out.println(Arrays.toString(arr));
    Sorter.sort(arr);
    System.out.println(Arrays.toString(arr));*/

    Dog arr[] = new Dog[]{new Dog(3),new Dog(5),new Dog(1)};
    System.out.println(Arrays.toString(arr));
    Sorter.sort(arr,(d1,d2)->{
      if(d1.getFood()<d2.getFood()) return 1;
      else if(d1.getFood()>d2.getFood()) return -1;
      else return 0;
    });
    System.out.println(Arrays.toString(arr));
  }

}
