package com.der.observerMode.delegate;

/**
 * @ClassName StockObserver
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/6 2:48
 * @Version 1.0
 **/
public class StockObserver {

    private String name;

    private String state;

    public StockObserver(String name) {
        this.name = name;
    }

    public void watchStock(){
        this.state = "开始看股票！";
    }

    public void stopStock(String stop){
        this.state = "停止看股票";
        System.out.println(String.format("%s %s",name,state));
    }
}
