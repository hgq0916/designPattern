package com.mashibing.designpattern.visitor;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.visitor.Memory
 * @Description: TODO
 * @date 2020/8/4 16:18
 */
public class Memory extends ComputePart {

  @Override
  void accept(Visitor visitor) {
    visitor.visitMemory(this);
  }

  @Override
  double getPrice() {
    return 400;
  }
}
