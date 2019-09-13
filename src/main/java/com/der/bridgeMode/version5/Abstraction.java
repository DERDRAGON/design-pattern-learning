package com.der.bridgeMode.version5;

/**
 * @ClassName Abstraction
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/20 20:14
 * @Version 1.0
 **/
public class Abstraction {

    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation(){
        implementor.operation();
    }
}
