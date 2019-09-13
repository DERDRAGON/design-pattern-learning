package com.der.compositeMode.version2;

/**
 * @ClassName FinanceDepartment
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/18 22:25
 * @Version 1.0
 **/
public class FinanceDepartment extends Company {

    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void displey(int depth) {
        System.out.println(depth + "-" + name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(String.format("%s 公司财务收支管理！", name));
    }
}
