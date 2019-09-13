package com.der.mediatorMode.version1;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/24 22:01
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);

        mediator.setConcreteColleague1(colleague1);
        mediator.setConcreteColleague2(colleague2);

        colleague1.send("吃过饭了吗？");
        colleague2.send("没有呢，你打算请客？");

    }
}
