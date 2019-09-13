package com.der.abstractFactory.version3;

import com.der.abstractFactory.version1.User;
import com.der.abstractFactory.version2.IUser;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 18:20
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        User user = new User(111, "用户111");
        Department department = new Department(222, "部门222");
        IFactory sqlServerFactory = new SqlServerFactory();
        IUser sqlServerFactoryUser = sqlServerFactory.createUser();
        sqlServerFactoryUser.insert(user);
        User userUser = sqlServerFactoryUser.getUser(111);
        System.out.println(userUser);

        IDepartment dept = sqlServerFactory.createDept();
        dept.insert(department);
        Department deptDept = dept.getDept(222);
        System.out.println(deptDept);
    }
}
