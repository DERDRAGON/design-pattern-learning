package com.der.abstractFactory.version6;

/**
 * @ClassName HaierAirConditioner
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 23:50
 * @Version 1.0
 **/
public class HaierAirConditioner implements AirConditioner {
    @Override
    public void changeTemperature() {
        System.out.println("海尔空调温度调节中。。。");
    }
}
