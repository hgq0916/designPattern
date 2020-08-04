package com.mashibing.designpattern.visitor;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.visitor.MainBoard
 * @Description: TODO
 * @date 2020/8/4 16:19
 */
public class MainBoard extends ComputePart {

  @Override
  void accept(Visitor visitor) {
    visitor.visitMainBoard(this);
  }

  @Override
  double getPrice() {
    return 600;
  }
}
