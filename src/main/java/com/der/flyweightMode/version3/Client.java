package com.der.flyweightMode.version3;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/25 23:09
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        WebsiteFactory factory = new WebsiteFactory();

        Website website1 = factory.getWebsiteCategory("产品展示");
        website1.user();
        Website website2 = factory.getWebsiteCategory("产品展示");
        website2.user();
        Website website3 = factory.getWebsiteCategory("产品展示");
        website3.user();
        Website website4 = factory.getWebsiteCategory("博客");
        website4.user();
        Website website5 = factory.getWebsiteCategory("博客");
        website5.user();
        Website website6 = factory.getWebsiteCategory("博客");
        website6.user();
    }
}
