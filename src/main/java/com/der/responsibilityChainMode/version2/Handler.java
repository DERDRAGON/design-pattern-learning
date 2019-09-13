package com.der.responsibilityChainMode.version2;

/**
 * @ClassName Handler
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/21 3:03
 * @Version 1.0
 **/
public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(int request);
}
