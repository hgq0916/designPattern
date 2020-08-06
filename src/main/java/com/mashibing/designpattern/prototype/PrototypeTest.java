package com.mashibing.designpattern.prototype;

public class PrototypeTest {

  public static void main(String[] args) throws Exception {
    Person person = new Person("张三",new Location("sh","001"));
    Person person1 = (Person) person.clone();

    person1.setName("李四");
    person1.getLocation().setRoomNo("002");
    System.out.println(person);
    System.out.println(person1);
  }

}
