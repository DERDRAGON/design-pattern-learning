package com.der.visitorMode.version3;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ObjectStructure
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/27 3:57
 * @Version 1.0
 **/
public class ObjectStructure {

    private List<Element> elements = new ArrayList<>();

    public void attach(Element element){
        elements.add(element);
    }

    public void detach(Element element){
        elements.remove(element);
    }

    public void accept(Visitor visitor){
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
