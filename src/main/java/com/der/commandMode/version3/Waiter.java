package com.der.commandMode.version3;

import com.der.commandMode.version2.BakeChickenWingCommand;
import com.der.commandMode.version2.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Waiter
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/20 21:25
 * @Version 1.0
 **/
public class Waiter {

    private List<Command> orders = new ArrayList<>();

    public void setOrder(Command command){
        if (command instanceof BakeChickenWingCommand){
            System.out.println("鸡翅没有了，请点别的烧烤！");
        } else {
            orders.add(command);
            System.out.println("添加了订单！");
        }
    }

    public void cancelOrder(Command command){
        orders.remove(command);
        System.out.println("取消订单！");
    }

    public void execute(){
        for (Command order : orders) {
            order.executeCommand();
        }
    }
}
