package com.der.adapterMode.version2;

/**
 * @ClassName ForWards
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/15 21:45
 * @Version 1.0
 **/
public class ForWards extends Player {

    public ForWards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(String.format("前锋 %s 进攻", name));
    }

    @Override
    public void defense() {
        System.out.println(String.format("前锋 %s 防守", name));
    }
}
