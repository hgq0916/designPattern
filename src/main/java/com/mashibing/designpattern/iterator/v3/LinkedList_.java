package com.mashibing.designpattern.iterator.v3;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.iterator.v1.LinkedList_
 * @Description: TODO
 * @date 2020/8/4 10:58
 */
public class LinkedList_ implements Collection_ {

  Node head;
  Node tail;

  int size = 0;

  public void add(Object o){
    Node node = new Node(o,null);
    if(head == tail && head == null){
      head = node;
      tail = node;
    }else {
      /*Node n = head;
      while (n.next != null){
        n = n.next;
      }
      n.next = node;*/
      tail.next = node;
      tail = node;
    }

    size++;

  }

  public Object get(int index){
    if(index>=size) throw new ArrayIndexOutOfBoundsException();
    int i=0;
    Node node = head;
    while (i < index) {
      node = node.next;
      i++;
    }
    return node.data;
  }

  @Override
  public Iterator_ iterator() {
    return new Itr_();
  }

  private class Itr_ implements Iterator_{

    Node current = head;

    @Override
    public boolean hasNext() {
      if(current != null) return true;
      return false;
    }

    @Override
    public Object next() {
      if(current==null) throw new ArrayIndexOutOfBoundsException();
      Node n = current;
      current = current.next;
      return n.data;
    }

  }


  class Node {
    Object data;
    Node next;

    public Node(Object o, Node next) {
      this.data = o;
      this.next = next;
    }
  }

  public int size(){
    return size;
  }

}
