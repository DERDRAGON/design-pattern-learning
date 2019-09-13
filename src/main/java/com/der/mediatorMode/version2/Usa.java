package com.der.mediatorMode.version2;

/**
 * @ClassName Usa
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/24 22:08
 * @Version 1.0
 **/
public class Usa extends Country {

    public Usa(UntedNations mediator) {
        super(mediator);
    }

    public void declare(String message){
        mediator.declare(message,this);
    }

    public void getMessage(String message){
        System.out.println(String.format("美国获得对方信息：%s", message));
    }
}
