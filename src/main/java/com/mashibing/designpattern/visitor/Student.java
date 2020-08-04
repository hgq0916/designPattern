package com.mashibing.designpattern.visitor;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.visitor.Student
 * @Description: TODO
 * @date 2020/8/4 15:12
 */
public class Student implements Visitor{

  @Override
  public double visitCpu(ComputePart cpu) {
    return cpu.getPrice()*0.7;
  }

  @Override
  public double visitMemory(ComputePart memory) {
    return memory.getPrice()*0.7;
  }

  @Override
  public double visitMainBoard(ComputePart mainBoard) {
    return mainBoard.getPrice()*0.7;
  }

}
