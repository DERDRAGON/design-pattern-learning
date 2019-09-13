package com.der.observerMode.delegate;

import java.lang.reflect.Method;

/**
 * @ClassName Event
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 2:27
 * @Version 1.0
 **/
public class Event {
    private Object object;

    private String methodName;

    private Object[] params;

    private Class[] parameterTypes;

    public Event(Object object, String methodName, Object[] params) {
        this.object = object;
        this.methodName = methodName;
        this.params = params;
        contractParamType(params);
    }

    private void contractParamType(Object[] params){
        this.parameterTypes = new Class[params.length];
        for (int i = 0; i < params.length; i++) {
            parameterTypes[i] = params[i].getClass();
        }
    }

    public void invoke() throws Exception{
        Method method = object.getClass().getMethod(this.methodName, this.parameterTypes);
        if (null == method) {
            return;
        }
        method.invoke(this.object,this.params);
    }
}
