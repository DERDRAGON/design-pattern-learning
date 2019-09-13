package com.der.adapterMode.version3;

import com.der.adapterMode.version2.Player;

/**
 * @ClassName Translator
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/15 22:10
 * @Version 1.0
 **/
public class Translator extends Player {

    private ForeignCenter center = new ForeignCenter();

    public Translator(String name) {
        super(name);
        center.setName(name);
    }

    @Override
    public void attack() {
        center.jingong();
    }

    @Override
    public void defense() {
        center.fangshou();
    }
}
