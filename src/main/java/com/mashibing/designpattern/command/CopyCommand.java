package com.mashibing.designpattern.command;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.command.CopyCommand
 * @Description: TODO
 * @date 2020/8/5 14:43
 */
public class CopyCommand extends Command {

  Content content;

  public CopyCommand(Content content){
    this.content = content;
  }

  @Override
  public void doIt() {
    String str = content.msg + content.msg;
    content.msg = str;
  }

  @Override
  public void undo() {
    content.msg = content.msg.substring(0,content.msg.length()/2);
  }
}
