package com.mashibing.designpattern.flyWeight;

public class FlyWeightTest2 {

  public static void main(String[] args) {
    BulletPool bulletPool = BulletPool.getInstance();

    Bullet[] bullets = new Bullet[5];

    for(int i=0;i<5;i++){
      bullets[i] = bulletPool.getBullet(i,i*2);
    }

    for(Bullet bullet :bullets){
      System.out.println(bullet);
    }

    bullets[2].die();

    Bullet bullet = bulletPool.getBullet(40, 40);
    System.out.println(bullet);

  }

}
