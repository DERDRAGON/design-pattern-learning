package com.der.abstractFactory.version6;

/**
 * @ClassName TCLAirConditioner
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 23:51
 * @Version 1.0
 **/
public class TCLAirConditioner implements AirConditioner {
    @Override
    public void changeTemperature() {
        System.out.println("TCL空调温度调节中。。。");
    }
}
