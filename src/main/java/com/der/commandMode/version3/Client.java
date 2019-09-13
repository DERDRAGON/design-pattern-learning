package com.der.commandMode.version3;

import com.der.commandMode.version1.Barbecuer;
import com.der.commandMode.version2.BakeChickenWingCommand;
import com.der.commandMode.version2.BakeMuttonCommand;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/20 21:31
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        Barbecuer barbecuer = new Barbecuer();
        BakeMuttonCommand command = new BakeMuttonCommand(barbecuer);
        BakeMuttonCommand command1 = new BakeMuttonCommand(barbecuer);

        BakeChickenWingCommand wingCommand = new BakeChickenWingCommand(barbecuer);

        Waiter waiter = new Waiter();
        waiter.setOrder(command);
        waiter.setOrder(command1);
        waiter.setOrder(wingCommand);
        waiter.execute();
    }
}
