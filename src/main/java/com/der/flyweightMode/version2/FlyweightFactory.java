package com.der.flyweightMode.version2;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName FlyweightFactory
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/25 22:49
 * @Version 1.0
 **/
public class FlyweightFactory {

    public Map<String, Flyweight> flyweights = new HashMap<>();

    public FlyweightFactory() {
        flyweights.put("X",new ConcreteFlyweight());
        flyweights.put("Y",new ConcreteFlyweight());
        flyweights.put("Z",new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key){
        return flyweights.get(key);
    }
}
