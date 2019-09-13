package com.der.stateMode.version2;

/**
 * @ClassName ConcreteState
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/14 3:38
 * @Version 1.0
 **/
public class ConcreteStateA extends State {
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}
