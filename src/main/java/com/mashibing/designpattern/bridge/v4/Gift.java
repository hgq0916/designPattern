package com.mashibing.designpattern.bridge.v4;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.bridge.Git
 * @Description: TODO
 * @date 2020/8/5 10:25
 */
public abstract class Gift {

  protected GiftImpl giftImpl;

  public Gift(GiftImpl giftImpl){
    this.giftImpl =giftImpl;
  }

}
