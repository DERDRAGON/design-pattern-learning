package com.der.observerMode.delegate;

/**
 * @ClassName NbaObserver
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 2:51
 * @Version 1.0
 **/
public class NbaObserver {

    private String name;

    private String state;

    public NbaObserver(String name) {
        this.name = name;
    }

    public void watchNba(){
        this.state = "开始看NBA";
    }

    public void stopNba(String stop){
        this.state = "停止看NBA";
        System.out.println(String.format("%s %s",name,state));
    }
}
