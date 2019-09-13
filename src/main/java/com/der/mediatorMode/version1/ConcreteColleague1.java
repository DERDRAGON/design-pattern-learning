package com.der.mediatorMode.version1;

/**
 * @ClassName ConcreteColleague
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/24 21:48
 * @Version 1.0
 **/
public class ConcreteColleague1 extends Colleague{

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void notifyEnvent(String message){
        System.out.println(String.format("同事1得到信息 %s", message));
    }
}
