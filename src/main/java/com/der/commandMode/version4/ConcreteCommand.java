package com.der.commandMode.version4;

/**
 * @ClassName ConcreteCommand
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/20 23:04
 * @Version 1.0
 **/
public class ConcreteCommand extends Command {

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.actions();
    }
}
