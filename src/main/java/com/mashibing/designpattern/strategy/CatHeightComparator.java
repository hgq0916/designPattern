package com.mashibing.designpattern.strategy;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.strategy.CatHeightComparator
 * @Description: TODO
 * @date 2020/7/28 15:35
 */
public class CatHeightComparator implements Comparator<Cat> {

  @Override
  public int compareTo(Cat t1, Cat t2) {
    if(t1.getHeight()>t2.getHeight()) return 1;
    else if(t1.getHeight()<t2.getHeight()) return -1;
    return 0;
  }
}
