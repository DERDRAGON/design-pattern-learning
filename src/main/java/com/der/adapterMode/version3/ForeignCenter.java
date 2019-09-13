package com.der.adapterMode.version3;

/**
 * @ClassName ForeignCenter
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/15 22:06
 * @Version 1.0
 **/
public class ForeignCenter {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void jingong(){
        System.out.println(String.format("外籍中锋 %s 进攻", name));
    }

    public void fangshou(){
        System.out.println(String.format("外籍中锋 %s 防守", name));
    }
}
