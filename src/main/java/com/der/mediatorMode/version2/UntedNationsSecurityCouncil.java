package com.der.mediatorMode.version2;

/**
 * @ClassName UntedNationsSecurityCouncil
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/24 22:15
 * @Version 1.0
 **/
public class UntedNationsSecurityCouncil extends UntedNations {

    private Usa usa;

    private Iraq iraq;

    public void setUsa(Usa usa) {
        this.usa = usa;
    }

    public void setIraq(Iraq iraq) {
        this.iraq = iraq;
    }

    @Override
    public void declare(String message, Country country) {
        if (country == usa){
            usa.getMessage(message);
        } else {
            iraq.getMessage(message);
        }
    }
}
