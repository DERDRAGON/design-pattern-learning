package com.der.bridgeMode.version3;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/20 0:21
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        HandsetBrand hand = new HandsetBrandMAddressList();
        hand.run();

        hand = new HandsetBrandMGame();
        hand.run();

        hand = new HandsetBrandNAddressList();
        hand.run();

        hand = new HandsetBrandNGame();
        hand.run();
    }
}
