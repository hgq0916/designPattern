package com.mashibing.designpattern.visitor;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.visitor.Visitor
 * @Description: TODO
 * @date 2020/8/4 15:02
 */
public interface Visitor {

  double visitCpu(ComputePart cpu);

  double visitMemory(ComputePart memory);

  double visitMainBoard(ComputePart mainBoard);

}
