package com.mashibing.designpattern.visitor;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.visitor.Compute
 * @Description: TODO
 * @date 2020/8/4 14:55
 */
public class Compute {

  /**
   * 获取组装电脑的价格，学生购买打7折，企业购买打6折
   */

  CPU cpu = new CPU();
  Memory memory = new Memory();
  MainBoard mainBoard = new MainBoard();

  public void accept(Visitor visitor){
    visitor.visitCpu(cpu);
    visitor.visitMemory(memory);
    visitor.visitMainBoard(mainBoard);
  }

}