package com.der.observerMode.delegate;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 2:53
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        Notifier notifier = new ConcreteNotifier();
        StockObserver observer = new StockObserver("小王");
        NbaObserver observer1 = new NbaObserver("小李");
        notifier.addListener(observer, "stopStock", "停止");
        notifier.addListener(observer1, "stopNba", "停止");
        notifier.notifyX();
    }
}
