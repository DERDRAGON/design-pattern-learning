package com.der.abstractFactory.version5;

/**
 * @ClassName AccessAccessFactory
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 23:05
 * @Version 1.0
 **/
public class AccessAccessFactory implements AccessFactory {

    @Override
    public IEntityDao createDb() {
        System.out.println("创建AccessFactory");
        return new UserEntityDao();
    }

}
