package com.der.stateMode.version3;

/**
 * @ClassName NoonState
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/14 4:12
 * @Version 1.0
 **/
public class NoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 13){
            System.out.println(String.format("当前时间：%.2f 点 上午工作，精神百倍！", work.getHour()));
        } else {
            work.setCurrent(new AfternoonState());
        }
    }
}
