package com.mashibing.designpattern.visitor;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.visitor.VisitorTest
 * @Description: TODO
 * @date 2020/8/4 15:15
 */
public class VisitorTest {

  public static void main(String[] args) {
    Compute compute = new Compute();
    Student stu = new Student();
    Enterprise enterprise = new Enterprise();

    compute.accept(stu);
    compute.accept(enterprise);

    System.out.println(stu.getTotalPrice());
    System.out.println(enterprise.getTotalPrice());

  }

}
