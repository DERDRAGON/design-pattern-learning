package com.der.memorandumMode.version3;

/**
 * @ClassName GameRole
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/16 22:10
 * @Version 1.0
 **/
public class GameRole {

    private int vit;

    private int atk;

    private int def;

    public void init(){
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    public void fight(){
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    public void stateDisplay(){
        System.out.println("游戏角色当前状态：");
        System.out.println(String.format("体力：%s", vit));
        System.out.println(String.format("攻击力：%s", atk));
        System.out.println(String.format("防御力：%s", def));
    }

    public RoleStateMemento saveState(){
        return new RoleStateMemento(vit, atk, def);
    }

    public void recoveryState(RoleStateMemento roleStateMemento){
        this.atk = roleStateMemento.getAtk();
        this.vit = roleStateMemento.getVit();
        this.def = roleStateMemento.getDef();
    }

}
