package com.der.visitorMode.version3;

/**
 * @ClassName ConcreteElementA
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/27 3:53
 * @Version 1.0
 **/
public class ConcreteElementA extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitconcreteElementA(this);
    }

    public void operationA(){
        System.out.println("操作A");
    }
}
