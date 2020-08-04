package com.mashibing.designpattern.iterator.v4;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.iterator.v2.Collection_
 * @Description: TODO
 * @date 2020/8/4 11:15
 */
public interface Collection_<E>  extends Iterable_<E> {

  public int size();

  public E get(int index);

  public void add(E o);

}
