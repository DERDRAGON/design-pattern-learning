package com.der.stateMode.version3;

/**
 * @ClassName ForenoonState
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/14 3:59
 * @Version 1.0
 **/
public class ForenoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 12){
            System.out.println(String.format("当前时间：%.2f 点上午工作，精神百倍！", work.getHour()));
        } else {
            work.setCurrent(new NoonState());
        }
    }
}
