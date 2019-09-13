package com.der.commandMode.version4;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/20 23:04
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        ConcreteCommand command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);

        invoker.executeCommand();
    }
}
