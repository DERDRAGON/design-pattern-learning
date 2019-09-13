package com.der.flyweightMode.version3;

/**
 * @ClassName ConcreteWebsite
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/25 22:58
 * @Version 1.0
 **/
public class ConcreteWebsite extends Website {

    private String name = "";

    public ConcreteWebsite(String name) {
        this.name = name;
    }

    @Override
    public void user() {
        System.out.println(String.format("网站分类：%s",name));
    }
}
