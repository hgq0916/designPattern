package com.mashibing.designpattern.visitor;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.visitor.Compute
 * @Description: TODO
 * @date 2020/8/4 14:55
 */
public class Compute {

  /**
   * 学生购买打7折，企业购买打6折
   */

  ComputePart cpu = new ComputePart("cpu",900.0);
  ComputePart memory = new ComputePart("memory",300.0);
  ComputePart mainBoard = new ComputePart("mainBoard",600.0);

  public double getCpuPrice(Visitor visitor){
    return visitor.visitCpu(cpu);
  }

  public double getMemoryPrice(Visitor visitor){
    return visitor.visitMemory(memory);
  }

  public double getMainBoardPrice(Visitor visitor){
    return visitor.visitCpu(mainBoard);
  }

}

class ComputePart {
  private double price;
  private String name;

  public ComputePart(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public double getPrice(){
    return price;
  }

}