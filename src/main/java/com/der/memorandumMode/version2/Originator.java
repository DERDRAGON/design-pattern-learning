package com.der.memorandumMode.version2;

/**
 * @ClassName Originator
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/16 21:41
 * @Version 1.0
 **/
public class Originator {

    private String state;

    public Memento createMemento(){
        return new Memento(state);
    }

    public void setMemento(Memento memento){
        this.state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void show(){
        System.out.println(String.format("state = %s", state));
    }
}
