package com.der.compositeMode.version2;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ConcreateCompany
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/18 22:20
 * @Version 1.0
 **/
public class ConcreateCompany extends Company {

    private List<Company> children = new ArrayList<>();

    public ConcreateCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        children.remove(company);
    }

    @Override
    public void displey(int depth) {
        System.out.println( depth +"-" + name);
        for (Company child : children) {
            child.displey(depth+2 );
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company child : children) {
            child.lineOfDuty();
        }
    }
}
