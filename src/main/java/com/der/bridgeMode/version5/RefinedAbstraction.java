package com.der.bridgeMode.version5;

/**
 * @ClassName RefinedAbstraction
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/20 20:16
 * @Version 1.0
 **/
public class RefinedAbstraction extends Abstraction {

    @Override
    public void operation() {
        implementor.operation();
    }
}
