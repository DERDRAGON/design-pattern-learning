package com.der.singletonMode.version1;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/19 23:18
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        if (instance == instance1){
            System.out.println("两个对象都是相同的实例！");
        }
    }
}
