package com.mashibing.designpattern.strategy;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.strategy.Comparator
 * @Description: 比较器
 * @date 2020/7/28 15:28
 */
@FunctionalInterface
public interface Comparator<T> {

  int compareTo(T t1,T t2);

}
