package com.mashibing.designpattern.command;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.command.InsertCommand
 * @Description: TODO
 * @date 2020/8/5 14:48
 */
public class InsertCommand extends Command {

  Content content;

  int pos;
  String insertStr ="";

  public InsertCommand(Content content){
    this.content = content;
  }

  @Override
  public void doIt() {
    insertStr = "hello";
    pos = 5;
    String s = content.msg.substring(0, pos) + insertStr + content.msg
        .substring(pos, content.msg.length());
    content.msg = s;
  }

  @Override
  public void undo() {
    String s = content.msg.substring(0, pos) + content.msg
        .substring(pos + insertStr.length(), content.msg.length());
    content.msg = s;
  }
}
