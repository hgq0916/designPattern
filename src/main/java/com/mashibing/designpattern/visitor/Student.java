package com.mashibing.designpattern.visitor;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.visitor.Student
 * @Description: TODO
 * @date 2020/8/4 15:12
 */
public class Student implements Visitor{

  private double totalPrice =0;

  public double getTotalPrice() {
    return totalPrice;
  }

  @Override
  public void visitCpu(CPU cpu) {
    totalPrice+=cpu.getPrice()*0.8;
  }

  @Override
  public void visitMemory(Memory memory) {
    totalPrice+=memory.getPrice()*0.8;
  }

  @Override
  public void visitMainBoard(MainBoard mainBoard) {
    totalPrice+=mainBoard.getPrice()*0.8;
  }
}
