package com.der.commandMode.version2;

import com.der.commandMode.version1.Barbecuer;

/**
 * @ClassName Command
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/20 21:17
 * @Version 1.0
 **/
public abstract class Command {

    protected Barbecuer receiver;

    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }

    public abstract void executeCommand();
}
