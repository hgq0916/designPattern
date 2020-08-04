package com.mashibing.designpattern.iterator.v4;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.iterator.v1.LinkedList_
 * @Description: TODO
 * @date 2020/8/4 10:58
 */
public class LinkedList_<E> implements Collection_<E> {

  Node head;
  Node tail;

  int size = 0;

  public void add(E o){
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

  public E get(int index){
    if(index>=size) throw new ArrayIndexOutOfBoundsException();
    int i=0;
    Node node = head;
    while (i < index) {
      node = node.next;
      i++;
    }
    return (E) node.data;
  }

  @Override
  public Iterator_ iterator() {
    return new Itr_();
  }

  private class Itr_<E> implements Iterator_<E> {

    Node current = head;

    @Override
    public boolean hasNext() {
      if(current != null) return true;
      return false;
    }

    @Override
    public E next() {
      if(current==null) throw new ArrayIndexOutOfBoundsException();
      Node n = current;
      current = current.next;
      return (E) n.data;
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
