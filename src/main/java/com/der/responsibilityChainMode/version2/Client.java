package com.der.responsibilityChainMode.version2;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/21 3:09
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);

        int[] requeats = {1,2,4,23,5,45,23,545};

        for (int requeat : requeats) {
            handler1.handleRequest(requeat);
        }
    }
}
