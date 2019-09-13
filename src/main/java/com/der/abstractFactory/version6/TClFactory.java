package com.der.abstractFactory.version6;

/**
 * @ClassName TClFactory
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 23:54
 * @Version 1.0
 **/
public class TClFactory implements EFactory {
    @Override
    public Television produceTelevision() {
        return new TCLTelevision();
    }

    @Override
    public AirConditioner produceAitConditioner() {
        return new TCLAirConditioner();
    }
}
