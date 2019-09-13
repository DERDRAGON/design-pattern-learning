package com.der.abstractFactory.version4;

import com.der.abstractFactory.version1.User;
import com.der.abstractFactory.version2.IUser;
import com.der.abstractFactory.version3.Department;
import com.der.abstractFactory.version3.IDepartment;

/**
 * @ClassName Client
 * @Desctiption TOD
 * @Author 曹世龙
 * @Date 2019/7/6 22:56
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        User user = new User(111, "用户ID111");
        Department department = new Department(222, "部门ID222");
        IUser iUser = DataAccess.createUser();
        IDepartment dept = DataAccess.createDept();
        iUser.insert(user);
        dept.insert(department);
        User userUser = iUser.getUser(111);
        System.out.println(userUser);
        Department deptDept = dept.getDept(222);
        System.out.println(deptDept);
    }
}
