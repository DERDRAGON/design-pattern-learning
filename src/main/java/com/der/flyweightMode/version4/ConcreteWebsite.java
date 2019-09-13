package com.der.flyweightMode.version4;

/**
 * @ClassName ConcreteWebsite
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/25 23:28
 * @Version 1.0
 **/
public class ConcreteWebsite extends Website {

    private String name = "";

    public ConcreteWebsite(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println(String.format("网站分类：%s 用户：%s", name,user.getName()));
    }
}
