package com.der.abstractFactory.version3;

/**
 * @ClassName SqlServerDepartment
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 18:13
 * @Version 1.0
 **/
public class AccessDepartment implements IDepartment {

    @Override
    public void insert(Department department) {
        System.out.println("在 Access 中给Department 添加一条数据：" + department);
    }

    @Override
    public Department getDept(int id) {
        System.out.println("在 Access 中根据ID获取一条数据！");
        return new Department(111,"部门111");
    }
}
