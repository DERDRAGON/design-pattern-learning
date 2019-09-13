package com.der.interpreterMode.version2;

/**
 * @ClassName Note
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/27 2:13
 * @Version 1.0
 **/
public class Note extends Expression {

    @Override
    public void excute(String key, Double value) {
        String note = "";
        switch (key){
            case "C":
                note = "1";
                break;
            case "D":
                note = "2";
                break;
            case "E":
                note = "3";
                break;
            case "F":
                note = "4";
                break;
            case "G":
                note = "5";
                break;
            case "A":
                note = "6";
                break;
            case "B":
                note = "7";
                break;
            default:
        }
        System.out.println(String.format("%s 解释器结果", note));
    }
}
