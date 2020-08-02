package com.mashibing.designpattern.composite;

public abstract class Node {

  public Node(String name){
    this.name = name;
  }

  private String name;

  public void print(){
    System.out.println(name);
  }

}
