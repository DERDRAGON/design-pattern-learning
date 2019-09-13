package com.der.compositeMode.version1;

/**
 * @ClassName Cli
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/16 22:54
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite x = new Composite("Composite X");
        x.add(new Leaf("Leaf XA"));
        x.add(new Leaf("Leaf XB"));

        root.add(x);

        Composite y = new Composite("Composite Y");
        y.add(new Leaf("Leaf YA"));
        y.add(new Leaf("Leaf YB"));

        root.add(y);

        Leaf leaf = new Leaf("leaf D");

        root.add(leaf);
        root.remove(leaf);

        root.display(1);

    }
}
