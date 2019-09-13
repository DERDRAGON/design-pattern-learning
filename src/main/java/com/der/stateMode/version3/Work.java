package com.der.stateMode.version3;

/**
 * @ClassName Work
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/14 3:55
 * @Version 1.0
 **/
public class Work {

    private State current;

    public Work() {
        current = new ForenoonState();
    }

    private double hour;

    private boolean finish = false;

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public void setCurrent(State current) {
        this.current = current;
    }

    public void writeProgram(){
        current.writeProgram(this);
    }
}
