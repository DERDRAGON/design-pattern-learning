package com.der.abstractFactory.version3;

import com.der.abstractFactory.version2.IUser;
import com.der.abstractFactory.version2.SqlServerUser;

/**
 * @ClassName SqlServerFactory
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 18:18
 * @Version 1.0
 **/
public class SqlServerFactory implements IFactory {

    @Override
    public IUser createUser() {
        return new SqlServerUser();
    }

    @Override
    public IDepartment createDept() {
        return new SqlServerDepartment();
    }
}
