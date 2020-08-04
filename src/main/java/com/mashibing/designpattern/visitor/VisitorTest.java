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

    System.out.println(compute.getCpuPrice(stu));
    System.out.println(compute.getMainBoardPrice(stu));
    System.out.println(compute.getMemoryPrice(stu));

    System.out.println(compute.getCpuPrice(enterprise));
    System.out.println(compute.getMainBoardPrice(enterprise));
    System.out.println(compute.getMemoryPrice(enterprise));

  }

}
