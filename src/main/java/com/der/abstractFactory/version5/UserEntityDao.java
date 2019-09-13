package com.der.abstractFactory.version5;

/**
 * @ClassName UserEntityDao
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 23:26
 * @Version 1.0
 **/
public class UserEntityDao implements IEntityDao {

    @Override
    public void insert(IEntity entity) {
        System.out.println(String.format("插入实体：%s", entity));
    }

    @Override
    public IEntity getEntity(Object key) {
        System.out.println(String.format("获取实体ByID：%s", key));
        return new UserEntity();
    }
}
