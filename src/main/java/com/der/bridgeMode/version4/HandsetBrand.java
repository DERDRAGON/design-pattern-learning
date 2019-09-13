package com.der.bridgeMode.version4;

/**
 * @ClassName HandsetBrand
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/20 0:59
 * @Version 1.0
 **/
public abstract class HandsetBrand {

    protected HandsetSoft handsetSoft;

    public HandsetBrand(HandsetSoft handsetSoft) {
        this.handsetSoft = handsetSoft;
    }

    public abstract void run();
}
