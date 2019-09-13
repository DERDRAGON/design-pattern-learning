package com.der.interpreterMode.version1;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/27 1:34
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> list = new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new NonTerminalExpression());
        list.add(new TerminalExpression());
        list.add(new NonTerminalExpression());
        for (AbstractExpression expression : list) {
            expression.interpret(context);
        }
    }
}
