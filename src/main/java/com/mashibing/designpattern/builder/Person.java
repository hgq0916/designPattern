package com.mashibing.designpattern.builder;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.builder.Person
 * @Description: TODO
 * @date 2020/8/5 10:06
 */
public class Person {

  private String name;

  private String sex;

  private int age;

  private Location location;

  private String mobile;

  private String idCardNum;

  private Person(){}

  static class PersonBuilder {
    private Person person = new Person();

    public PersonBuilder basicInfo(String name,String sex,int age){
      person.name = name;
      person.sex = sex;
      person.age = age;
      return this;
    }

    public PersonBuilder location(String street,String roomNo){
      Location location = new Location(street,roomNo);
      person.location = location;
      return this;
    }

    public PersonBuilder mobile(String mobile){
      person.mobile = mobile;
      return this;
    }

    public PersonBuilder idCardNum(String idCardNum){
      person.idCardNum = idCardNum;
      return this;
    }

    public Person build(){
      return person;
    }

  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", sex='" + sex + '\'' +
        ", age=" + age +
        ", location=" + location +
        ", mobile='" + mobile + '\'' +
        ", idCardNum='" + idCardNum + '\'' +
        '}';
  }
}

class Location {
  private String street;

  private String roomNo;

  public Location(String street, String roomNo) {
    this.street = street;
    this.roomNo = roomNo;
  }

  @Override
  public String toString() {
    return "Location{" +
        "street='" + street + '\'' +
        ", roomNo='" + roomNo + '\'' +
        '}';
  }
}
