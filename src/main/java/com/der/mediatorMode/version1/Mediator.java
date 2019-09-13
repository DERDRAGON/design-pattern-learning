package com.der.mediatorMode.version1;

/**
 * @ClassName Mediator
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/24 21:44
 * @Version 1.0
 **/
public abstract class Mediator {

    public abstract void send(String message, Colleague colleague);
}
