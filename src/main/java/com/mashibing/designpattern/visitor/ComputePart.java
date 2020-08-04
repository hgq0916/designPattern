package com.mashibing.designpattern.visitor;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.visitor.ComputePart
 * @Description: 电脑零件
 * @date 2020/8/4 16:17
 */
public abstract class ComputePart {

  abstract void accept(Visitor visitor);

  abstract double getPrice();

}
