package com.der.visitorMode.version3;

/**
 * @ClassName Element
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/27 3:52
 * @Version 1.0
 **/
public abstract class Element {

    public abstract void accept(Visitor visitor);
}
