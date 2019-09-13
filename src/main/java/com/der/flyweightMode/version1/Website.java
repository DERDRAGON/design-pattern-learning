package com.der.flyweightMode.version1;

/**
 * @ClassName Website
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/25 22:09
 * @Version 1.0
 **/
public class Website {

    private String name = "";

    public Website(String name) {
        this.name = name;
    }

    public void use(){
        System.out.println(String.format("网站分类:%s", name));
    }
}
