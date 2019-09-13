package com.der.abstractFactory.version3;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName Department
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 18:11
 * @Version 1.0
 **/
@Data
public class Department implements Serializable {

    private int id;

    private String deptName;

    public Department() {
    }

    public Department(int id, String deptName) {
        this.id = id;
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
