package com.der.iteratorMode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ConcreteAggreagte
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/18 22:55
 * @Version 1.0
 **/
public class ConcreteAggreagte extends Aggreate {

    private List<Object> items = new ArrayList<>();

    public Integer getCount(){
        return items.size();
    }

    public Object get(int index){
        return items.get(index);
    }

    public void add(Object object){
        items.add(object);
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteItarator(this);
    }
}
