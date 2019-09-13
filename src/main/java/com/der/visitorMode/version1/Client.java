package com.der.visitorMode.version1;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/27 2:38
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Man man = new Man("成功");
        list.add(man);
        Woman woman = new Woman("成功");
        list.add(woman);
        Man man1 = new Man("失败");
        list.add(man1);
        Woman woman1 = new Woman("失败");
        list.add(woman1);
        Man man2 = new Man("恋爱");
        list.add(man2);
        Woman woman2 = new Woman("恋爱");
        list.add(woman2);
        for (Person person : list) {
            person.getConclusion();
        }
    }
}
