package com.mashibing.designpattern.flyWeight;

import java.util.UUID;

public class Bullet {

  private long id = UUID.randomUUID().getLeastSignificantBits();

  private boolean living = true;

  private int x,y;
  private int width =20;
  private int height = 40;

  public Bullet(int x,int y){
    this.x = x;
    this.y = y;
  }

  public void setLiving(boolean living){
    this.living = living;
  }

  public void die(){
    this.living = false;
  }

  public boolean isLiving() {
    return living;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  @Override
  public String toString() {
    return "Bullet{" +
        "id=" + id +
        ", living=" + living +
        ", x=" + x +
        ", y=" + y +
        ", width=" + width +
        ", height=" + height +
        '}';
  }
}
