package com.der.singletonMode.version1;

/**
 * @ClassName version3
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/19 23:09
 * @Version 1.0
 **/
public class Singleton {

    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}