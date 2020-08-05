package com.mashibing.designpattern.command.cor;

import com.mashibing.designpattern.command.Content;
import com.mashibing.designpattern.command.CopyCommand;
import com.mashibing.designpattern.command.DeleteCommand;
import com.mashibing.designpattern.command.InsertCommand;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.command.cor.CorTest
 * @Description: TODO
 * @date 2020/8/5 17:14
 */
public class CorTest {

  public static void main(String[] args) {
    CommandChain commandChain = new CommandChain();
    Content content = new Content("hello,command chain");

    commandChain.doIt(new InsertCommand(content));
    System.out.println(content.getMsg());
    commandChain.doIt(new CopyCommand(content));
    System.out.println(content.getMsg());
    commandChain.doIt(new DeleteCommand(content));
    System.out.println(content.getMsg());
    System.out.println("------------------------------");
    commandChain.undo();
    System.out.println(content.getMsg());
    commandChain.undo();
    System.out.println(content.getMsg());
    commandChain.undo();
    System.out.println(content.getMsg());

  }

}
