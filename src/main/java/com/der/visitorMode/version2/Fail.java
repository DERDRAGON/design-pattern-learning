package com.der.visitorMode.version2;

/**
 * @ClassName Success
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/27 2:54
 * @Version 1.0
 **/
public class Fail extends Action {
    @Override
    public void getManConclusion(Man man) {
        System.out.println(String.format("%s %s 时，门头喝酒，谁也不用劝！", man.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }

    @Override
    public void getWoManConclusion(Woman woman) {
        System.out.println(String.format("%s %s 时，眼泪汪汪，谁也劝不了！", woman.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }
}
