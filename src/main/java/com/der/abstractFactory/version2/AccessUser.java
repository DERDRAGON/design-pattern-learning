package com.der.abstractFactory.version2;

import com.der.abstractFactory.version1.User;

/**
 * @ClassName SqlServerUser
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 17:36
 * @Version 1.0
 **/
public class AccessUser implements IUser {

    @Override
    public void insert(User user) {
        System.out.println("在 Access 中给User表增加一条记录！");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在 Access 中根据ID得到User表一条记录！");
        return new User(111, "用户111");
    }
}
