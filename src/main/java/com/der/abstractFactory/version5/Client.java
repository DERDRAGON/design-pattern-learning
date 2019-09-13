package com.der.abstractFactory.version5;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 23:30
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        UserEntity userEntity = new UserEntity(111, "用户111");
        AccessFactory accessFactory = null;
        try {
            accessFactory = (AccessFactory) Class.forName("com.der.abstractFactory.version5.SqlServerAccessFactory").newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        IEntityDao db = accessFactory.createDb();
        db.insert(userEntity);
        IEntity entity = db.getEntity(111);
        System.out.println(entity);
    }
}
