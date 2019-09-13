package com.der.flyweightMode.version1;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/25 22:12
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        Website web1 = new Website("产品展示");
        web1.use();
        Website web2 = new Website("产品展示");
        web2.use();
        Website web3 = new Website("产品展示");
        web3.use();
        Website web4 = new Website("博客");
        web4.use();
        Website web5 = new Website("博客");
        web5.use();
        Website web6 = new Website("博客");
        web6.use();
    }
}
