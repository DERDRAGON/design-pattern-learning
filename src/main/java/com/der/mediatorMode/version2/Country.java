package com.der.mediatorMode.version2;

/**
 * @ClassName Country
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/24 22:07
 * @Version 1.0
 **/
public abstract class Country {

    protected UntedNations mediator;

    public Country(UntedNations mediator) {
        this.mediator = mediator;
    }
}
