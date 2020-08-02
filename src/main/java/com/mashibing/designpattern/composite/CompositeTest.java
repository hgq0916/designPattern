package com.mashibing.designpattern.composite;

public class CompositeTest {

  public static void main(String[] args) {
    Tree tree = new Tree();
    TreeBranch treeBranch1 = new TreeBranch("treeBranch1");
    TreeBranch treeBranch2 = new TreeBranch("treeBranch2");
    TreeLeaf treeleaf1 = new TreeLeaf("treeleaf1");
    tree.addNode(treeBranch1);
    tree.addNode(treeBranch2);
    tree.addNode(treeleaf1);

    Node treeBranch11 = new TreeBranch("treeBranch11");
    Node treeBranch12 = new TreeBranch("treeBranch12");
    treeBranch1.addNode(treeBranch11);
    treeBranch1.addNode(treeBranch12);

    TreeLeaf treeleaf11 = new TreeLeaf("treeleaf11");
    ((TreeBranch) treeBranch11).addNode(treeleaf11);

    tree.print();

  }

}
