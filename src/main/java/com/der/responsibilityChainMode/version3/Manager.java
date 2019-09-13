package com.der.responsibilityChainMode.version3;

import com.der.responsibilityChainMode.version1.Request;

/**
 * @ClassName Manager
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/23 23:54
 * @Version 1.0
 **/
public abstract class Manager {

    protected String name;

    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    public void setSuperior(Manager superior){
        this.superior = superior;
    }

    public abstract void requestApplication(Request request);

}
