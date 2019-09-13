package com.der.memorandumMode.version2;

/**
 * @ClassName Memeto
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/16 21:43
 * @Version 1.0
 **/
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
