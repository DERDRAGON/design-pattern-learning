package com.der.responsibilityChainMode.version1;

/**
 * @ClassName Manager
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/21 1:56
 * @Version 1.0
 **/
public class Manager {

    protected String name;

    public Manager(String name) {
        this.name = name;
    }

    public void getResult(String managerLevel, Request request){
        if (managerLevel.equals("经理")){
            if (request.getRequestType().equals("请假") && request.getNumber() <= 2){
                System.out.println(String.format("%s : %s 数量 %s 被批准！", name,request.getRequestContent(), request.getNumber()));
            } else {
                System.out.println(String.format("%s : %s 数量 %s 我无权处理！！", name,request.getRequestContent(), request.getNumber()));
            }
        } else if (managerLevel.equals("总监")){
            if (request.getRequestType().equals("请假") && request.getNumber() <=5){
                System.out.println(String.format("%s : %s 数量 %s 被批准！", name,request.getRequestContent(), request.getNumber()));
            } else {
                System.out.println(String.format("%s : %s 数量 %s 我无权处理！", name,request.getRequestContent(), request.getNumber()));
            }
        } else if (managerLevel.equals("总经理")){
            if (request.getRequestType().equals("请假")){
                System.out.println(String.format("%s : %s 数量 %s 被批准！", name,request.getRequestContent(), request.getNumber()));
            } else if (request.getRequestType().equals("加薪") && request.getNumber() <= 500){
                System.out.println(String.format("%s : %s 数量 %s 被批准！", name,request.getRequestContent(), request.getNumber()));
            } else if (request.getRequestType().equals("加薪") && request.getNumber() > 500){
                System.out.println(String.format("%s : %s 数量 %s 再说吧！", name,request.getRequestContent(), request.getNumber()));
            }
        }
    }
}
