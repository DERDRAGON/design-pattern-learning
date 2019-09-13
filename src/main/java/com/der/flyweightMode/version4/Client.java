package com.der.flyweightMode.version4;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/25 23:33
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        WebsiteFactory factory = new WebsiteFactory();

        Website website1 = factory.getWebsiteCategory("产品展示");
        website1.use(new User("瞎猜1"));
        Website website2 = factory.getWebsiteCategory("产品展示");
        website2.use(new User("瞎猜2"));
        Website website3 = factory.getWebsiteCategory("产品展示");
        website3.use(new User("瞎猜3"));
        Website website4 = factory.getWebsiteCategory("博客");
        website4.use(new User("瞎猜4"));
        Website website5 = factory.getWebsiteCategory("博客");
        website5.use(new User("瞎猜5"));
        Website website6 = factory.getWebsiteCategory("博客");
        website6.use(new User("瞎猜6"));
    }
}
