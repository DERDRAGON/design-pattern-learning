package com.der.abstractFactory.version1;

import lombok.Data;

/**
 * @ClassName User
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 16:45
 * @Version 1.0
 **/
@Data
public class User {

    private int id;

    private String name;

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
