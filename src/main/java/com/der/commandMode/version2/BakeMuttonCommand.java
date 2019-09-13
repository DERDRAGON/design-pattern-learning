package com.der.commandMode.version2;

import com.der.commandMode.version1.Barbecuer;

/**
 * @ClassName BakeMuttonCommand
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/20 21:19
 * @Version 1.0
 **/
public class BakeMuttonCommand extends Command{

    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.bakeMutton();
    }
}
