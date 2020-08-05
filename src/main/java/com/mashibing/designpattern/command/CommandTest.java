package com.mashibing.designpattern.command;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.command.CommandTest
 * @Description: TODO
 * @date 2020/8/5 14:55
 */
public class CommandTest {

  public static void main(String[] args) {
    Content content = new Content();
    //Command command = new CopyCommand(content);
    //Command command = new DeleteCommand(content);
    Command command = new InsertCommand(content);
    command.doIt();
    System.out.println(content.msg);
    command.undo();
    System.out.println(content.msg);



  }

}
