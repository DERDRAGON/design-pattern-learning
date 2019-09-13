package com.der.adapterMode.version1;

/**
 * @ClassName Adapter
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/15 21:40
 * @Version 1.0
 **/
public class Adapter extends Target {

    private Adatee adatee = new Adatee();

    @Override
    public void requeat() {
        adatee.specificRequest();
    }
}
