package com.der.commandMode.version2;

/**
 * @ClassName Waiter
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/20 21:20
 * @Version 1.0
 **/
public class Waiter {

    private Command command;

    public void setOrder(Command command){
        this.command = command;
    }

    public void execute() {
        command.executeCommand();
    }
}
