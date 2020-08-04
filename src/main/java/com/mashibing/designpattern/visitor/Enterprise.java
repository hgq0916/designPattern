package com.mashibing.designpattern.visitor;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.visitor.Enterprise
 * @Description: TODO
 * @date 2020/8/4 15:14
 */
public class Enterprise implements Visitor {

  private double totalPrice =0;

  public double getTotalPrice() {
    return totalPrice;
  }

  @Override
  public void visitCpu(CPU cpu) {
    totalPrice+=cpu.getPrice()*0.7;
  }

  @Override
  public void visitMemory(Memory memory) {
    totalPrice+=memory.getPrice()*0.7;
  }

  @Override
  public void visitMainBoard(MainBoard mainBoard) {
    totalPrice+=mainBoard.getPrice()*0.7;
  }
}
