package com.mashibing.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Tree {

  List<Node> nodes = new ArrayList<>();

  public void addNode(Node node){
    nodes.add(node);
  }

  public void print(){
    for(Node node:nodes){
      print(node,0);
    }
  }

  public static void print(Node node,int depth){
    for(int i=0;i<depth;i++){
      System.out.print("---");
    }
    node.print();
    if(node instanceof TreeBranch){
      TreeBranch treeBranch = (TreeBranch) node;
      List<Node> treeNodeList = treeBranch.getTreeNodeList();
      for(Node node1:treeNodeList){
        print(node1,depth+1);
      }
    }
  }

}
