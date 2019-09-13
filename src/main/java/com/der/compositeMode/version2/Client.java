package com.der.compositeMode.version2;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/18 22:26
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        ConcreateCompany root = new ConcreateCompany("北京总公司");
        root.add(new HrDeptCompany("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        ConcreateCompany shanghai = new ConcreateCompany("上海华东分公司");
        shanghai.add(new HrDeptCompany("上海华东分公司人力资源部"));
        shanghai.add(new FinanceDepartment("上海华东分公司财务部"));
        root.add(shanghai);

        root.displey(1);
        root.lineOfDuty();
    }
}
