package com.mashibing.designpattern.prototype;

public class Person implements Cloneable{

  private String name;

  private Location location;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public Person(String name, Location location) {
    this.name = name;
    this.location = location;
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    Person person = (Person) super.clone();
    Location location1 = (Location) this.location.clone();
    person.setLocation(location1);
    return person;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", location=" + location +
        '}';
  }

}
