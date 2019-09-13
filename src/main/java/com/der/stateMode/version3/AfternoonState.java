package com.der.stateMode.version3;

/**
 * @ClassName AfternoonState
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/14 4:14
 * @Version 1.0
 **/
public class AfternoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() <17){
            System.out.println(String.format("当前时间：%.2f 点 下午状态还不错，继续努力！", work.getHour()));
        } else {
            work.setCurrent(new EveningState());
        }
    }
}
