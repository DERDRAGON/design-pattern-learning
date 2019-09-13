package com.der.visitorMode.version2;

/**
 * @ClassName Success
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/27 2:54
 * @Version 1.0
 **/
public class Amativeness extends Action {
    @Override
    public void getManConclusion(Man man) {
        System.out.println(String.format("%s %s 时，凡事不懂也要装懂！", man.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }

    @Override
    public void getWoManConclusion(Woman woman) {
        System.out.println(String.format("%s %s 时，遇事懂也装作不懂！", woman.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }
}
