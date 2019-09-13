package com.der.visitorMode.version2;

/**
 * @ClassName Woman
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/27 2:53
 * @Version 1.0
 **/
public class Woman extends Persion {
    @Override
    public void accept(Action visitor) {
        visitor.getWoManConclusion(this);
    }
}
