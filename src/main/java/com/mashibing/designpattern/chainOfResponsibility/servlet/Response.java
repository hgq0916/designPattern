package com.mashibing.designpattern.chainOfResponsibility.servlet;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.chainOfResponsibility.servlet.Response
 * @Description: TODO
 * @date 2020/7/30 16:54
 */
public class Response {

  String content;

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public void write(String str){
    if(content == null){
      content = str;
    }else {
      content += str;
    }
  }

}
