package com.mashibing.designpattern.flyWeight;

import java.util.ArrayList;
import java.util.List;

public class BulletPool {

  private static BulletPool bulletPool = new BulletPool();

  private BulletPool(){}

  public static BulletPool getInstance(){
    return bulletPool;
  }

  List<Bullet> bullets = new ArrayList<>();

  private  int INIT_SIZE = 5;

  {
    for(int i=0;i<INIT_SIZE;i++){
      Bullet bullet = new Bullet(0, 0);
      bullet.setLiving(false);
      bullets.add(bullet);
    }
  }

  public Bullet getBullet(int x,int y){
    for(int i=0;i<bullets.size();i++){
      Bullet bullet = bullets.get(i);
      if(!bullet.isLiving()){
        bullet.setX(x);
        bullet.setY(y);
        bullet.setLiving(true);
        return bullet;
      }
    }
    //没有可用的子弹
    Bullet bullet = new Bullet(x,y);
    bullet.setLiving(true);

    bullets.add(bullet);

    return bullet;
  }

}
