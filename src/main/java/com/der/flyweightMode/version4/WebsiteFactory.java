package com.der.flyweightMode.version4;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName WebsiteFactory
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/25 23:31
 * @Version 1.0
 **/
public class WebsiteFactory {

    private Map<String,Website> flywrights = new HashMap<>();

    public Website getWebsiteCategory(String key){
        if (!flywrights.containsKey(key)) {
            flywrights.put(key, new ConcreteWebsite(key));
        }
        return flywrights.get(key);
    }

    public int getWebsiteCount(){
        return flywrights.size();
    }
}
