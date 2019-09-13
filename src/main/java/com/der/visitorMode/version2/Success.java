package com.der.visitorMode.version2;

/**
 * @ClassName Success
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/27 2:54
 * @Version 1.0
 **/
public class Success extends Action {
    @Override
    public void getManConclusion(Man man) {
        System.out.println(String.format("%s %s 时，背后多半有一个伟大的女人！", man.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }

    @Override
    public void getWoManConclusion(Woman woman) {
        System.out.println(String.format("%s %s 时，背后大多有一个不成功的男人！", woman.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }
}
