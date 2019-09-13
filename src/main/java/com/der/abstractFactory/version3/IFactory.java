package com.der.abstractFactory.version3;

import com.der.abstractFactory.version2.IUser;

/**
 * @ClassName IFactory
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 18:17
 * @Version 1.0
 **/
public interface IFactory {

    IUser createUser();

    IDepartment createDept();
}
