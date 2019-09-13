package com.der.iteratorMode;

/**
 * @ClassName Iterator
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/18 22:51
 * @Version 1.0
 **/
public abstract class Iterator {

    public abstract Object first();

    public abstract Object next();

    public abstract boolean isDone();

    public abstract Object currentItem();
}
