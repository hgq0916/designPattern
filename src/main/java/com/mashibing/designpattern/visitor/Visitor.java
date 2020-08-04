package com.mashibing.designpattern.visitor;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.visitor.Visitor
 * @Description: TODO
 * @date 2020/8/4 15:02
 */
public interface Visitor {

  void visitCpu(CPU cpu);

  void visitMemory(Memory memory);

  void visitMainBoard(MainBoard mainBoard);

}
