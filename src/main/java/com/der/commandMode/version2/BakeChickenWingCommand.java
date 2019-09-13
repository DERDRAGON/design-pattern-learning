package com.der.commandMode.version2;

import com.der.commandMode.version1.Barbecuer;

/**
 * @ClassName BakeChickenWingCommand
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/20 21:20
 * @Version 1.0
 **/
public class BakeChickenWingCommand extends Command {

    public BakeChickenWingCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.bakeChickenWing();
    }
}
