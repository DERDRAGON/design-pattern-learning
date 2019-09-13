package com.der.compositeMode.version1;

/**
 * @ClassName Component
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/16 22:47
 * @Version 1.0
 **/
public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void display(int dept);
}
