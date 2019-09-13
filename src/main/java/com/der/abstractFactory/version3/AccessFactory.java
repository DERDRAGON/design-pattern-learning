package com.der.abstractFactory.version3;

import com.der.abstractFactory.version2.AccessUser;
import com.der.abstractFactory.version2.IUser;

/**
 * @ClassName AccessFactory
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 18:19
 * @Version 1.0
 **/
public class AccessFactory implements IFactory {

    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDept() {
        return new AccessDepartment();
    }
}
