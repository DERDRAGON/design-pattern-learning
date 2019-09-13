package com.der.abstractFactory.version5;

/**
 * <br>explain:</br>
 * <br>该类描述的业务</br>
 * <br>Created by 1297886375@qq.com on 2019/7/6 23:02</br>
 */
public interface AccessFactory {

    public IEntityDao createDb();
}
