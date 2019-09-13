package com.der.visitorMode.version3;

/**
 * @ClassName Visitor
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/27 3:51
 * @Version 1.0
 **/
public abstract class Visitor {

    public abstract void visitconcreteElementA(ConcreteElementA concreteElementA);
    public abstract void visitconcreteElementB(ConcreteElementB concreteElementB);
}
