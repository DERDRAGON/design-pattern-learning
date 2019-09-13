package com.der.visitorMode.version2;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/27 2:57
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        ObjecrStructure structure = new ObjecrStructure();
        structure.attach(new Man());
        structure.attach(new Woman());

        Success success = new Success();

        structure.display(success);

        Fail fail = new Fail();
        structure.display(fail);

        Amativeness amativeness = new Amativeness();
        structure.display(amativeness);

        Marriage marriage = new Marriage();
        structure.display(marriage);
    }
}
