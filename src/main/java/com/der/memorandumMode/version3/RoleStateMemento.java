package com.der.memorandumMode.version3;

/**
 * @ClassName RoleStateMemento
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/16 22:31
 * @Version 1.0
 **/
public class RoleStateMemento {

    private int vit;

    private int atk;

    private int def;

    public RoleStateMemento(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
