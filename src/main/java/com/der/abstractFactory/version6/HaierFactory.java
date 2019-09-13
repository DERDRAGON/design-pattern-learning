package com.der.abstractFactory.version6;

/**
 * @ClassName HaierFactory
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 23:53
 * @Version 1.0
 **/
public class HaierFactory implements EFactory {
    @Override
    public Television produceTelevision() {
        return new HaierTelevision();
    }

    @Override
    public AirConditioner produceAitConditioner() {
        return new HaierAirConditioner();
    }
}
