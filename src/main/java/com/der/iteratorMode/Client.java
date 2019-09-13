package com.der.iteratorMode;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/18 23:01
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        ConcreteAggreagte aggreagte = new ConcreteAggreagte();

        aggreagte.add("1");
        aggreagte.add("2");
        aggreagte.add("3");
        aggreagte.add("4");
        aggreagte.add("5");

        ConcreteItarator itarator = new ConcreteItarator(aggreagte);
        Object first = itarator.first();
        while (!itarator.isDone()){
            System.out.println(String.format("请买车票第 %s 位乘客！", itarator.currentItem()));
            itarator.next();
        }
    }
}
