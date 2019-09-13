package com.der.responsibilityChainMode.version3;

import com.der.responsibilityChainMode.version1.Request;

/**
 * @ClassName CommonManager
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/23 23:58
 * @Version 1.0
 **/
public class CommonManager extends Manager {

    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {
        if (request.getRequestType().equals("请假") && request.getNumber() <= 2){
            System.out.println(String.format("%s : %s 数量 %s 被批准！", name,request.getRequestContent(), request.getNumber()));
        } else if (superior != null){
            superior.requestApplication(request);
        }
    }
}
