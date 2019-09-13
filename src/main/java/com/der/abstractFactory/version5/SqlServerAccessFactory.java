package com.der.abstractFactory.version5;

/**
 * @ClassName SqlServerAccessFactory
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 23:04
 * @Version 1.0
 **/
public class SqlServerAccessFactory implements AccessFactory {

    @Override
    public IEntityDao createDb() {
        System.out.println("创建SqlServerFactory");
        return new UserEntityDao();
    }

}