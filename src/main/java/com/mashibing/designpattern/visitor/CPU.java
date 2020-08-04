package com.mashibing.designpattern.visitor;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.visitor.CPU
 * @Description: TODO
 * @date 2020/8/4 16:18
 */
public class CPU extends ComputePart {

  @Override
  void accept(Visitor visitor) {
    visitor.visitCpu(this);
  }

  @Override
  double getPrice() {
    return 900;
  }
}
