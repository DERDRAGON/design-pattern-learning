package com.der.compositeMode.version1;

import java.util.Collections;

/**
 * @ClassName Leaf
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/16 22:49
 * @Version 1.0
 **/
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("cannot add to a leaf");
    }

    @Override
    public void remove(Component component) {
        System.out.println("cannot remove to a leaf");
    }

    @Override
    public void display(int dept) {
        System.out.println(String.join("", Collections.nCopies(dept,"-")) + name);
    }
}
