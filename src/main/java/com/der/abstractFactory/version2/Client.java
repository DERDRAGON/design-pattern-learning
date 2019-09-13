package com.der.abstractFactory.version2;

import com.der.abstractFactory.version1.User;

/**
 * @ClassName CLient
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 18:06
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        User user = new User(111, "用户ID");
        IFactory factory = new SqlServerFactory();
        IUser iUser = factory.createUser();
        iUser.insert(user);
        User user1 = iUser.getUser(111);
        System.out.println(user1);
    }
}
