package com.der.visitorMode.version3;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/27 3:59
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.attach(new ConcreteElementA());
        structure.attach(new ConcreteElementB());

        ConcreteVisitor1 visitor1 = new ConcreteVisitor1();
        structure.accept(visitor1);

        ConcreteVisitor2 visitor2 = new ConcreteVisitor2();
        structure.accept(visitor2);
    }
}
