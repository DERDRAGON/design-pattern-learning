package com.der.memorandumMode.version1;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/15 22:17
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        GameRole dashe = new GameRole();
        dashe.init();
        dashe.stateDisplay();

        GameRole backup = new GameRole();
        backup.setVit(dashe.getVit());
        backup.setAtk(dashe.getVit());
        backup.setDef(dashe.getDef());

        dashe.fight();
        dashe.stateDisplay();

        dashe.setVit(backup.getVit());
        dashe.setAtk(backup.getAtk());
        dashe.setDef(backup.getDef());

        dashe.stateDisplay();
    }
}
