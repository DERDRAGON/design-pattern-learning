package com.der.api;

/**
 * @program: design-pattern-learning
 * @description: ${description}
 * @author: long
 * @create: 2019-08-29 17:41
 */
public class StringApi {

    public static void main(String[] args) {
        String str = "[[[[[";
        String replace = str.replace("[", ",");
        System.out.println(replace);
    }
}
