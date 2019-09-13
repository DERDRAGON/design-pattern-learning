package com.der.visitorMode.version3;

/**
 * @ClassName ConcreteVisitor1
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/27 3:54
 * @Version 1.0
 **/
public class ConcreteVisitor2 extends Visitor {
    @Override
    public void visitconcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(String.format("%s 被 %s 访问", concreteElementA.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }

    @Override
    public void visitconcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(String.format("%s 被 %s 访问", concreteElementB.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }
}
