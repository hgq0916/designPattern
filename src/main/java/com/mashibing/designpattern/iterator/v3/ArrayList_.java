package com.mashibing.designpattern.iterator.v3;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.iterator.v1.ArrayList_
 * @Description: TODO
 * @date 2020/8/4 10:51
 */
public class ArrayList_  implements Collection_ {

  private Object[] data = new Object[10];

  private int index = 0;

  public void add(Object o){
    if(index>=data.length){
      //扩容
      Object[] newData = new Object[data.length*2];
      System.arraycopy(data,0,newData,0,data.length);
      data = newData;
    }
    data[index] = o;
    index++;
  }

  public int size(){
    return index;
  }

  public Object get(int i) {
    if(i>=index) throw new ArrayIndexOutOfBoundsException();
    return data[i];
  }

  @Override
  public Iterator_ iterator() {
    return new Itr();
  }

  private class Itr implements Iterator_{

    int cursor = 0;

    @Override
    public boolean hasNext() {
      if(cursor<index) return true;
      return false;
    }

    @Override
    public Object next() {
      return data[cursor++];
    }

  }

}
