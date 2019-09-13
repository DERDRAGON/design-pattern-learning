package com.der.flyweightMode.version2;

/**
 * @ClassName ConcreteFlyweight
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/25 22:48
 * @Version 1.0
 **/
public class ConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println(String.format("具体Flyweight: %s", extrinsicstate));
    }
}
