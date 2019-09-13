package com.der.flyweightMode.version2;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/25 22:53
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        int extrinsicstate = 22;

        FlyweightFactory factory = new FlyweightFactory();
        Flyweight x = factory.getFlyweight("X");
        x.operation(--extrinsicstate);
        Flyweight y = factory.getFlyweight("Y");
        y.operation(--extrinsicstate);
        Flyweight z = factory.getFlyweight("Z");
        z.operation(--extrinsicstate);

        UnsharedConcreteFlyweight flyweight = new UnsharedConcreteFlyweight();
        flyweight.operation(--extrinsicstate);


    }
}
