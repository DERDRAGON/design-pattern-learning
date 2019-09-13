package com.der.commandMode.version4;

/**
 * @ClassName Invoker
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/20 23:01
 * @Version 1.0
 **/
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }
}
