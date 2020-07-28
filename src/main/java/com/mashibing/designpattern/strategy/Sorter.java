package com.mashibing.designpattern.strategy;

public class Sorter {

  public static void sort(int[] arr){
    for(int i=0;i<arr.length;i++){
      int min = i;
      for(int j=i;j<arr.length;j++){
        if(arr[min]>arr[j]) min = j;
      }
      if(min !=i){
        swap(arr,min,i);
      }
    }
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void sort(Comparable[] arr){
    for(int i=0;i<arr.length;i++){
      int min = i;
      for(int j=i;j<arr.length;j++){
        if(arr[min].compareTo(arr[j])>0) min = j;
      }
      if(min !=i){
        swap(arr,min,i);
      }
    }
  }

  private static void swap(Comparable[] arr, int i, int j) {
    Comparable temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

}
