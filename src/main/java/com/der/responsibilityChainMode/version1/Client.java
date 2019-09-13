package com.der.responsibilityChainMode.version1;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/21 2:13
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        Manager jinli = new Manager("金利");
        Manager zongjian = new Manager("纵剪");
        Manager zhongjingli = new Manager("钟精力");

        Request request = new Request();
        request.setRequestType("加薪");
        request.setRequestContent("小菜请求加薪！");
        request.setNumber(100);

        jinli.getResult("经理",request);
        zongjian.getResult("总监",request);
        zhongjingli.getResult("总经理",request);

        request.setRequestType("请假");
        request.setRequestContent("小菜请假");
        request.setNumber(3);

        jinli.getResult("经理",request);
        zongjian.getResult("总监",request);
        zhongjingli.getResult("总经理",request);
    }
}
