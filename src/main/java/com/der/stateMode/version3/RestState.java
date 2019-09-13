package com.der.stateMode.version3;

/**
 * @ClassName RestState
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/14 4:23
 * @Version 1.0
 **/
public class RestState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.println(String.format("当前时间：%.2f 点 下班回家了。", work.getHour()));
    }
}
