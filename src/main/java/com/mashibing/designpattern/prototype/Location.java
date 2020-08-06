package com.mashibing.designpattern.prototype;

public class Location implements Cloneable{

  String street;

  String roomNo;

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getRoomNo() {
    return roomNo;
  }

  public void setRoomNo(String roomNo) {
    this.roomNo = roomNo;
  }

  public Location(String street, String roomNo) {
    this.street = street;
    this.roomNo = roomNo;
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  @Override
  public String toString() {
    return "Location{" +
        "street='" + street + '\'' +
        ", roomNo='" + roomNo + '\'' +
        '}';
  }
}
