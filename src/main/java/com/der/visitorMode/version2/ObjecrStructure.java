package com.der.visitorMode.version2;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ObjecrStructure
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/27 2:58
 * @Version 1.0
 **/
public class ObjecrStructure {

    private List<Persion> persions = new ArrayList<>();

    public void attach(Persion persion){
        persions.add(persion);
    }

    public void detach(Persion persion){
        persions.remove(persion);
    }

    public void display(Action visitor){
        for (Persion persion : persions) {
            persion.accept(visitor);
        }
    }
}
