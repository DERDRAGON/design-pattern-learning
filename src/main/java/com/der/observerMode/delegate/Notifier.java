package com.der.observerMode.delegate;

/**
 * @ClassName Notifer
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 2:44
 * @Version 1.0
 **/
public abstract class Notifier {

    private EventHandler eventHandler = new EventHandler();

    public EventHandler getEventHandler() {
        return eventHandler;
    }

    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    public abstract void addListener(Object object,String methodName,Object... args);

    public abstract void notifyX();
}
