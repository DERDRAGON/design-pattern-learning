package com.der.stateMode.version3;

/**
 * @ClassName SleepingState
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/14 4:21
 * @Version 1.0
 **/
public class SleepingState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.println(String.format("当前时间：%.2f 点 不行了，睡着了。", work.getHour()));
    }
}
