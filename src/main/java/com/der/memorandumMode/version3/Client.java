package com.der.memorandumMode.version3;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/16 22:42
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        gameRole.init();
        gameRole.stateDisplay();

        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        RoleStateMemento roleStateMemento = gameRole.saveState();
        caretaker.setRoleStateMemento(roleStateMemento);

        gameRole.fight();
        gameRole.stateDisplay();

        gameRole.recoveryState(caretaker.getRoleStateMemento());

        gameRole.stateDisplay();

    }
}
