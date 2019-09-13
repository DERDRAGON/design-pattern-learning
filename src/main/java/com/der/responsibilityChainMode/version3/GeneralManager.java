package com.der.responsibilityChainMode.version3;

import com.der.responsibilityChainMode.version1.Request;

/**
 * @ClassName MajorDomo
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/24 0:01
 * @Version 1.0
 **/
public class GeneralManager extends Manager {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {
        if (request.getRequestType().equals("请假")){
            System.out.println(String.format("%s : %s 数量 %s 被批准！", name,request.getRequestContent(), request.getNumber()));
        } else if (request.getRequestType().equals("加薪") && request.getNumber() <= 500){
            System.out.println(String.format("%s : %s 数量 %s 被批准！", name,request.getRequestContent(), request.getNumber()));
        } else if (request.getRequestType().equals("加薪") && request.getNumber() > 500){
            System.out.println(String.format("%s : %s 数量 %s 再说吧！", name,request.getRequestContent(), request.getNumber()));
        }
    }
}
