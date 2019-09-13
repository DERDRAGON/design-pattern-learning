package com.der.visitorMode.version1;

/**
 * @ClassName Man
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/27 2:33
 * @Version 1.0
 **/
public class Man extends Person {

    public Man(String action) {
        super(action);
    }

    @Override
    public void getConclusion() {
        if ("成功".equals(action)){
            System.out.println(String.format("%s %s 时，背后多半有一个伟大的女人！", this.getClass().getSimpleName(), action));
        } else if ("失败".equals(action)){
            System.out.println(String.format("%s %s 时，门头喝酒，谁也不用劝！", this.getClass().getSimpleName(), action));
        } else if ("恋爱".equals(action)){
            System.out.println(String.format("%s %s 时，凡事不懂也要装懂！", this.getClass().getSimpleName(), action));
        }
    }
}
