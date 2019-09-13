package com.der.interpreterMode.version2;

import org.apache.commons.lang3.StringUtils;

/**
 * @ClassName Expression
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/27 2:05
 * @Version 1.0
 **/
public abstract class Expression {

    public void interpret(PlayContext context){
        if (StringUtils.isBlank(context.getText())){
            return;
        } else {
            String key = context.getText().substring(0, 1);
            String value = context.getText().substring(2);
            Double value1 = Double.valueOf(value.substring(0, value.indexOf(" ")));
            context.setText(value.substring(value.indexOf(" ")+1));
            excute(key,value1);
        }
    }

    public abstract void excute(String key, Double value);
}
