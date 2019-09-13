package com.der.adapterMode.version3;

import com.der.adapterMode.version2.ForWards;
import com.der.adapterMode.version2.Guards;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/15 22:11
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        ForWards forWards = new ForWards("巴蒂尔");
        forWards.attack();
        Guards guards = new Guards("麦克格雷迪");
        guards.attack();

        Translator translator = new Translator("姚明");
        translator.attack();
        translator.defense();
    }
}
