package com.der.stateMode.version3;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/14 4:31
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(9);
        work.writeProgram();
        work.setHour(10);
        work.writeProgram();
        work.setHour(12);
        work.writeProgram();
        work.setHour(13);
        work.writeProgram();
        work.setHour(14);
        work.writeProgram();
        work.setHour(17);
        work.writeProgram();

        work.setFinish(true);

        work.setHour(19);
        work.writeProgram();
        work.setHour(22);
        work.writeProgram();
    }
}

