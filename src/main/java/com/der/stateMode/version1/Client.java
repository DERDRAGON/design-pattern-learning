package com.der.stateMode.version1;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/7 22:47
 * @Version 1.0
 **/
public class Client {

    private static int hour = 0;

    private static boolean workFinished = false;

    private static void writeProgram(){
        if (hour<12){
            System.out.println(String.format("当前时间：%d 点，上午工作，精神百倍！", hour));
        } else if (hour < 13){
            System.out.println(String.format("当前时间：%d 点，饿了，午饭：犯困，午休。", hour));
        } else if (hour < 17){
            System.out.println(String.format("当前时间：%d 点 下午状态还不错，继续努力！", hour));
        } else {
            if (workFinished){
                System.out.println(String.format("当前时间：%d 点，下班回家了。", hour));
            } else {
                if (hour < 21) {
                    System.out.println(String.format("当前时间：%d 点，加班哦，疲累之极。", hour));
                } else {
                    System.out.println(String.format("当前时间：%d 点，不行了睡着了。", hour));
                }
            }
        }
    }

    public static void main(String[] args) {
        hour = 9;
        writeProgram();
        hour = 10;
        writeProgram();
        hour = 12;
        writeProgram();
        hour = 13;
        writeProgram();
        hour = 14;
        writeProgram();
        hour = 17;
        writeProgram();

        workFinished = true;

        hour = 19;
        writeProgram();
        hour = 22;
        writeProgram();
    }
}
