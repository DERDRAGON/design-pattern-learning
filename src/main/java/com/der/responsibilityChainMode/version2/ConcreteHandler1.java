package com.der.responsibilityChainMode.version2;

/**
 * @ClassName ConcreteHandler1
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/21 3:06
 * @Version 1.0
 **/
public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 0 && request <10){
            System.out.println(String.format("%s 处理请求 %s", this.getClass(), request));
        } else if (successor != null){
            successor.handleRequest(request);
        }
    }
}
