package com.der.singletonMode.version3;

/**
 * @ClassName SIngleton
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/19 23:39
 * @Version 1.0
 **/
public class Singleton {

    //饿汉式

    private static final Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }
}
