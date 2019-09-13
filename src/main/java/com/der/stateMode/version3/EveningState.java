package com.der.stateMode.version3;

/**
 * @ClassName EveningState
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/14 4:15
 * @Version 1.0
 **/
public class EveningState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.isFinish()){
            work.setCurrent(new RestState());
        } else {
            if (work.getHour() < 21){
                System.out.println(String.format("当前时间：%.2f 点 加班哦，疲累之极！", work.getHour()));
            } else {
                work.setCurrent(new SleepingState());
            }
        }
    }
}
