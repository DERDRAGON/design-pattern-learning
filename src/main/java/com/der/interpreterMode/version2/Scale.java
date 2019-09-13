package com.der.interpreterMode.version2;

/**
 * @ClassName Scale
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/27 2:16
 * @Version 1.0
 **/
public class Scale extends Expression {

    @Override
    public void excute(String key, Double value) {
        String scale = "";
        switch (value.intValue()){
            case 1:
                scale = "低音";
                break;
            case 2:
                scale = "中音";
                break;
            case 3:
                scale = "高音";
                break;
            default:
        }
        System.out.println(String.format("音阶结果：%s", scale));
    }
}
