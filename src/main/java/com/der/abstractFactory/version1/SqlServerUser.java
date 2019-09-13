package com.der.abstractFactory.version1;

/**
 * @ClassName SqlServerSql
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 17:15
 * @Version 1.0
 **/
public class SqlServerUser {

    public void insert(User user){
        System.out.println("在 SQL Server 中给User 表添加一条记录！");
    }

    public User getUser(int id){
        System.out.println("在 SQL Server 中根据ID得到User表一条记录！");
        return new User(111, "我的用户111");
    }
}