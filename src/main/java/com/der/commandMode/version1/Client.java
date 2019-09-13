package com.der.commandMode.version1;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/20 20:30
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        Barbecuer barbecuer = new Barbecuer();
        barbecuer.bakeMutton();
        barbecuer.bakeMutton();
        barbecuer.bakeMutton();
        barbecuer.bakeChickenWing();
        barbecuer.bakeMutton();
        barbecuer.bakeMutton();
        barbecuer.bakeMutton();
    }
}
