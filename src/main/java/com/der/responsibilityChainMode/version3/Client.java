package com.der.responsibilityChainMode.version3;

import com.der.responsibilityChainMode.version1.Request;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/24 0:04
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        Manager jinli = new CommonManager("金利");
        Manager zongjian = new MajorDomo("纵剪");
        Manager zhongjingli = new GeneralManager("钟精力");

        jinli.setSuperior(zongjian);
        zongjian.setSuperior(zhongjingli);

        Request request = new Request();
        request.setRequestType("加薪");
        request.setRequestContent("小菜请求加薪！");
        request.setNumber(100);

        jinli.requestApplication(request);
    }
}
