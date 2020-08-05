package com.mashibing.designpattern.command.cor;

import com.mashibing.designpattern.command.Command;
import java.util.LinkedList;
import java.util.List;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.command.cor.CommandChain
 * @Description: TODO
 * @date 2020/8/5 15:44
 */
public class CommandChain {

  LinkedList<Command> commands = new LinkedList<>();

  int pos = 0 ;

  public void doIt(Command command){
    command.doIt();
    commands.push(command);
  }

  public void undo(){
    Command command = commands.pop();
    command.undo();
  }

}
