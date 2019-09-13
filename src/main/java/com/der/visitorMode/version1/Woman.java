package com.der.visitorMode.version1;

/**
 * @ClassName Woman
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/27 2:37
 * @Version 1.0
 **/
public class Woman extends Person {

    public Woman(String action) {
        super(action);
    }

    @Override
    public void getConclusion() {
        if ("成功".equals(action)){
            System.out.println(String.format("%s %s 时，背后大多有一个不成功的男人！", this.getClass().getSimpleName(), action));
        } else if ("失败".equals(action)){
            System.out.println(String.format("%s %s 时，眼泪汪汪，谁也劝不了！", this.getClass().getSimpleName(), action));
        } else if ("恋爱".equals(action)){
            System.out.println(String.format("%s %s 时，遇事懂也装作不懂！", this.getClass().getSimpleName(), action));
        }
    }
}
