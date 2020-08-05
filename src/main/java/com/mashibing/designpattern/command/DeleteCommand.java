package com.mashibing.designpattern.command;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.command.DeleteCommand
 * @Description: TODO
 * @date 2020/8/5 14:46
 */
public class DeleteCommand extends Command {

  Content content;

  String deleteStr="";

  public DeleteCommand(Content content){
    this.content =content;
  }

  @Override
  public void doIt() {
    deleteStr = content.msg.substring(0,5);
    content.msg = content.msg.substring(5,content.msg.length());
  }

  @Override
  public void undo() {
    content.msg = deleteStr+content.msg;
  }
}
