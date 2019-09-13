package com.der.singletonMode.version2;

/**
 * @ClassName version3
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/19 23:32
 * @Version 1.0
 **/
public class Singleton {

    //懒汉式
    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
