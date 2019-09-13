package com.der.mediatorMode.version2;

/**
 * @ClassName Usa
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/24 22:08
 * @Version 1.0
 **/
public class Iraq extends Country {

    public Iraq(UntedNations mediator) {
        super(mediator);
    }

    public void declare(String message){
        mediator.declare(message,this);
    }

    public void getMessage(String message){
        System.out.println(String.format("伊拉克获得对方信息：%s", message));
    }
}
