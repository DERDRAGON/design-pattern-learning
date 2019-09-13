package com.der.stateMode.version2;

/**
 * @ClassName Context
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/14 3:33
 * @Version 1.0
 **/
public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request(){
        state.handle(this);
    }
}
