package com.der.visitorMode.version2;

/**
 * @ClassName Marriage
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/27 3:01
 * @Version 1.0
 **/
public class Marriage extends Action {
    @Override
    public void getManConclusion(Man man) {
        System.out.println(String.format("%s %s 时，感慨道：恋爱游戏终结时，‘有妻徒刑’遥遥无期。", man.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }

    @Override
    public void getWoManConclusion(Woman woman) {
        System.out.println(String.format("%s %s 时，欣慰曰：爱情长跑路漫漫，婚姻保险保平安。", woman.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }
}
