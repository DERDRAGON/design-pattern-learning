package com.der.bridgeMode.version4;

/**
 * @ClassName HandsetBrandN
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/20 1:01
 * @Version 1.0
 **/
public class HandsetBrandM extends HandsetBrand {

    public HandsetBrandM(HandsetSoft handsetSoft) {
        super(handsetSoft);
    }

    @Override
    public void run() {
        handsetSoft.run();
    }
}
