package com.der.abstractFactory.version4;

import com.der.abstractFactory.version2.AccessUser;
import com.der.abstractFactory.version2.IUser;
import com.der.abstractFactory.version2.SqlServerUser;
import com.der.abstractFactory.version3.AccessDepartment;
import com.der.abstractFactory.version3.IDepartment;
import com.der.abstractFactory.version3.SqlServerDepartment;

/**
 * @ClassName DataAccess
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 22:26
 * @Version 1.0
 **/
public class DataAccess {

    private static final String db = "SqlServer";

    private static final String db2 = "Access";

    public static IUser createUser(){
        IUser iUser = null;
        switch (db){
            case "SqlServer":
                iUser = new SqlServerUser();
                break;
            case "Access":
                iUser = new AccessUser();
                break;
            default:
        }
        return iUser;
    }

    public static IDepartment createDept(){
        IDepartment dept = null;
        switch (db){
            case "SqlServer":
                dept = new SqlServerDepartment();
                break;
            case "Access":
                dept = new AccessDepartment();
                break;
            default:
        }
        return dept;
    }
}
