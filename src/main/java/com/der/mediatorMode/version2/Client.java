package com.der.mediatorMode.version2;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/24 22:17
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        UntedNationsSecurityCouncil securityCouncil = new UntedNationsSecurityCouncil();

        Usa usa = new Usa(securityCouncil);
        Iraq iraq = new Iraq(securityCouncil);

        securityCouncil.setUsa(usa);
        securityCouncil.setIraq(iraq);

        usa.declare("不准研制核武器，否则发动战争！");
        iraq.declare("我们没有核武器，我们也不怕侵略！");
    }
}
