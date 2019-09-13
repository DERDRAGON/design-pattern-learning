package com.der.observerMode.delegate;

/**
 * @ClassName ConcreteNotifier
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 2:47
 * @Version 1.0
 **/
public class ConcreteNotifier extends Notifier {

    @Override
    public void addListener(Object object, String methodName, Object... args) {
        this.getEventHandler().addEvent(object,methodName,args);
    }

    @Override
    public void notifyX() {
        try {
            this.getEventHandler().notifyX();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
