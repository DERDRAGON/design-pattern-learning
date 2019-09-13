package com.der.adapterMode.version2;

/**
 * @ClassName Player
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/15 21:44
 * @Version 1.0
 **/
public abstract class Player {

    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public abstract void attack();

    public abstract void defense();
}
