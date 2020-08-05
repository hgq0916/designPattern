package com.mashibing.designpattern.builder;

import com.mashibing.designpattern.builder.Person.PersonBuilder;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.builder.PersonTest
 * @Description: TODO
 * @date 2020/8/5 10:13
 */
public class PersonTest {

  public static void main(String[] args) {
    Person person = new PersonBuilder()
        .basicInfo("张三", "难", 14)
        .idCardNum("234234234")
        .location("普陀区", "2344")
        .mobile("1787834343")
        .build();

    System.out.println(person);

  }

}
