package com.der.stateMode.version2;

/**
 * @ClassName ConcreteStateB
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/14 3:39
 * @Version 1.0
 **/
public class ConcreteStateB extends State {
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}
