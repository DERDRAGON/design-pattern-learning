package com.der.compositeMode.version2;

/**
 * @ClassName HrDeptCompany
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/18 22:24
 * @Version 1.0
 **/
public class HrDeptCompany extends Company {

    public HrDeptCompany(String name) {
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
        System.out.println(String.format("%s 员工招聘培训管理！", name));
    }
}
