package com.mashibing.designpattern.visitor;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.visitor.Enterprise
 * @Description: TODO
 * @date 2020/8/4 15:14
 */
public class Enterprise implements Visitor {

  @Override
  public double visitCpu(ComputePart cpu) {
    return cpu.getPrice()*0.6;
  }

  @Override
  public double visitMemory(ComputePart memory) {
    return memory.getPrice()*0.6;
  }

  @Override
  public double visitMainBoard(ComputePart mainBoard) {
    return mainBoard.getPrice()*0.6;
  }

}
