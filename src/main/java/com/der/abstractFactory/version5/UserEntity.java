package com.der.abstractFactory.version5;

import lombok.Data;

/**
 * @ClassName UserEntity
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 23:25
 * @Version 1.0
 **/
@Data
public class UserEntity implements IEntity {

    private int id;

    private String name;

    public UserEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public UserEntity() {

    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
