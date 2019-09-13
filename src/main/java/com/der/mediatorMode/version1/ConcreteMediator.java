package com.der.mediatorMode.version1;

/**
 * @ClassName ConcreteMediator
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/24 21:46
 * @Version 1.0
 **/
public class ConcreteMediator extends Mediator{

    private ConcreteColleague1 concreteColleague1;

    private ConcreteColleague2 concreteColleague2;

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == concreteColleague1){
            concreteColleague1.notifyEnvent(message);
        } else {
            concreteColleague2.notifyEnvent(message);
        }
    }

    public void setConcreteColleague1(ConcreteColleague1 concreteColleague1) {
        this.concreteColleague1 = concreteColleague1;
    }

    public void setConcreteColleague2(ConcreteColleague2 concreteColleague2) {
        this.concreteColleague2 = concreteColleague2;
    }
}
