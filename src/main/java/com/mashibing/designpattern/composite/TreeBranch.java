package com.mashibing.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class TreeBranch extends Node{

  public TreeBranch(String name){
    super(name);
  }

  private Object data;

  private List<Node> treeNodeList = new ArrayList<>();

  public void addNode(Node node){
    treeNodeList.add(node);
  }

  public List<Node> getTreeNodeList(){
    return treeNodeList;
  }

}
