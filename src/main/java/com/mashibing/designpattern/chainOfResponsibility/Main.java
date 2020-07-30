package com.mashibing.designpattern.chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.chainOfResponsibility.Main
 * @Description: 责任链
 * @date 2020/7/30 15:11
 */
public class Main {

  public static void main(String[] args) {
    /**
     * 对网上用户发表的评论信息进行处理后入库
     */
    Message message = new Message();
    message.setMsg("大家好，:),<script>欢迎来到mashibing.com,大家一起交流，工作966");

    /*//脚本替换
    String msg = message.getMsg();
    msg = msg.replace("<", "[").replace(">", "]");
    //敏感词替换
    msg = msg.replace("966","955");
    //url替换
    msg = msg.replace("mashibing.com","http://mashibing.com");*/

   /* new ScriptFilter().doFilter(message);
    new SensitiveFitler().doFilter(message);
*/

   /* List<Filter> filterChain = new ArrayList<>();
    filterChain.add(new ScriptFilter());
    filterChain.add(new SensitiveFitler());

    filterChain.forEach(
        filter -> filter.doFilter(message
        )
    );*/

 /*  new FilterChain().add(new ScriptFilter())
       .add(new SensitiveFitler()).doFilter(message);*/

    FilterChain filterChain = new FilterChain().add(new ScriptFilter())
        .add(new SensitiveFitler());

    FilterChain filterChain1 = new FilterChain().add(new UrlFilter()).add(filterChain);
    filterChain1.doFilter(message);

    System.out.println(message.getMsg());
  }
}


class Message {
  String msg;
  String name;

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }
}


interface Filter {

  boolean doFilter(Message msg);

}

class ScriptFilter implements Filter {

  @Override
  public boolean doFilter(Message msg) {
    String str = msg.getMsg();
    str = str.replace("<", "[").replace(">", "]");
    msg.setMsg(str);
    return false;
  }
}

class SensitiveFitler implements Filter {

  @Override
  public boolean doFilter(Message msg) {
    String str = msg.getMsg();
    //敏感词替换
    str = str.replace("966","955");
    msg.setMsg(str);

    return true;
  }
}

class UrlFilter implements Filter{

  @Override
  public boolean doFilter(Message msg) {
    String str = msg.getMsg();
    str = str.replace("mashibing.com","http://mashibing.com");
    msg.setMsg(str);

    return true;
  }
}

class FilterChain implements Filter{
  List<Filter> filterChain = new ArrayList<>();

  public FilterChain add(Filter filter){
    filterChain.add(filter);
    return this;
  }

  public boolean doFilter(Message message){

    for(Filter filter:filterChain){
      if(!filter.doFilter(message)) return false;
    }

    return true;
  }

}