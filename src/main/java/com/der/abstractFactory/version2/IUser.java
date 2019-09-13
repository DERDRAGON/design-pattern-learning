package com.der.abstractFactory.version2;

import com.der.abstractFactory.version1.User;

/**
 * @ClassName IUser
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 17:34
 * @Version 1.0
 **/
public interface IUser {

    void insert(User user);

    User getUser(int id);
}
