package com.der.adapterMode.version2;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/15 21:48
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        ForWards forWards = new ForWards("巴蒂尔");
        forWards.attack();
        Guards guards = new Guards("麦克格雷迪");
        guards.attack();

        Center center = new Center("姚明");
        center.attack();
        center.defense();
    }
}
