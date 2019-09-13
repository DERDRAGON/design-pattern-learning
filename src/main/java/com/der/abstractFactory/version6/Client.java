package com.der.abstractFactory.version6;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/7 0:04
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        EFactory factory = null;
        factory = (EFactory) XMLUtil.getBean();
        Television television = factory.produceTelevision();
        System.out.println(television);
        AirConditioner airConditioner = factory.produceAitConditioner();
        System.out.println(airConditioner);
    }
}
