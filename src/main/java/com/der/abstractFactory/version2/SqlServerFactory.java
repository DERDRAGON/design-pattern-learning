package com.der.abstractFactory.version2;

/**
 * @ClassName SqlServerFactory
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 18:05
 * @Version 1.0
 **/
public class SqlServerFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new SqlServerUser();
    }
}
