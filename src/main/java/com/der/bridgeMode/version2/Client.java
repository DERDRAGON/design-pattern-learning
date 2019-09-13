package com.der.bridgeMode.version2;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/20 0:08
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        HandsetGame game = new HandsetMdGame();
        game.run();
        HandsetGame game1 = new HandNdGame();
        game1.run();
    }
}
