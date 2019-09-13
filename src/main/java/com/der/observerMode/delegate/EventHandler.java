package com.der.observerMode.delegate;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName EventHandler
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 2:33
 * @Version 1.0
 **/
public class EventHandler {

    private List<Event> objects;

    public EventHandler() {
        this.objects = new ArrayList<>();
    }

    public void addEvent(Object object,String methodName,Object... args){
        objects.add(new Event(object,methodName,args));
    }

    public void notifyX() throws Exception{
        for (Event event : objects) {
            event.invoke();
        }
    }
}
