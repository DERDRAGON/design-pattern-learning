package com.der.memorandumMode.version2;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/16 21:47
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("ON");
        originator.show();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        originator.setState("OFF");
        originator.show();

        originator.setMemento(caretaker.getMemento());
        originator.show();
    }
}
