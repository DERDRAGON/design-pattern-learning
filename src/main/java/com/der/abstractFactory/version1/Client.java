package com.der.abstractFactory.version1;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 17:22
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        User user = new User(111, "用户dd");
        SqlServerUser sqlServerUser = new SqlServerUser();
        sqlServerUser.insert(user);
        User user1 = sqlServerUser.getUser(111);
        System.out.println(user1);
    }
}
