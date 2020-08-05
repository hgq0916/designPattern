package com.mashibing.designpattern.bridge.v2;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.bridge.v1.Boy
 * @Description: TODO
 * @date 2020/8/5 10:24
 */
public class Boy {

  public void chase(MM mm){
    Gift gift = new Flower();
    giveMM(mm,gift);
  }

  private void giveMM(MM mm, Gift gift) {

  }

}
