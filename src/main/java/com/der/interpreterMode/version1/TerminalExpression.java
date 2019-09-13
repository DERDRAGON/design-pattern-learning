package com.der.interpreterMode.version1;

/**
 * @ClassName TerminalExpression
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/27 1:32
 * @Version 1.0
 **/
public class TerminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器");
    }
}
