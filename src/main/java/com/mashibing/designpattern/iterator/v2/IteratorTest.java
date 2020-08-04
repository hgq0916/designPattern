package com.mashibing.designpattern.iterator.v2;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.iterator.v1.IteratorTest
 * @Description: TODO
 * @date 2020/8/4 10:55
 */
public class IteratorTest {

  public static void main(String[] args) {
    //Collection_ list = new LinkedList_();
    Collection_ list = new ArrayList_();
    for(int i=0;i<15;i++){
      list.add("e"+i);
    }
    System.out.println(list.size());
    for(int i=0;i<list.size();i++){
      System.out.println(list.get(i));
    }
  }

}
