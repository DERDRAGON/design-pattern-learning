package com.der.compositeMode.version2;

/**
 * @ClassName Company
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/18 22:18
 * @Version 1.0
 **/
public abstract class Company {

    protected String name;

    public Company(String name) {
        this.name = name;
    }

    public abstract void add(Company company);
    public abstract void remove(Company company);
    public abstract void displey(int depth);
    public abstract void lineOfDuty();
}
