package com.der.visitorMode.version1;

/**
 * @ClassName Persion
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/27 2:33
 * @Version 1.0
 **/
public abstract class Person {

    protected String action;

    public Person(String action) {
        this.action = action;
    }

    public abstract void getConclusion();
}
