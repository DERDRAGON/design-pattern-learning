package com.der.mediatorMode.version1;

/**
 * @ClassName Colleague
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/24 21:45
 * @Version 1.0
 **/
public class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
