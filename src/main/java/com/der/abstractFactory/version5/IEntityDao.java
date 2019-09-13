package com.der.abstractFactory.version5;

/**
 * @ClassName IEntity
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 23:09
 * @Version 1.0
 **/
public interface IEntityDao {

    public void insert(IEntity entity);

    public IEntity getEntity(Object key);
}
