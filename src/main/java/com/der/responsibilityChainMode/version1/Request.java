package com.der.responsibilityChainMode.version1;

/**
 * @ClassName Request
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/20 23:22
 * @Version 1.0
 **/
public class Request {

    private String requestType;

    private String requestContent;

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }
}
