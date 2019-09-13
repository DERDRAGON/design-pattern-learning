package com.der.abstractFactory.version2;

/**
 * @ClassName AccessFactory
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 18:06
 * @Version 1.0
 **/
public class AccessFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }
}
