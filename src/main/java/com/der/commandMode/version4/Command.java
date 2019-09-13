package com.der.commandMode.version4;

/**
 * @ClassName Command
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/20 23:00
 * @Version 1.0
 **/
public abstract class Command {

    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
