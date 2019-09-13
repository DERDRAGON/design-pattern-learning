package com.der.compositeMode.version1;
import	java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName Composite
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/16 22:51
 * @Version 1.0
 **/
public class Composite extends Component {

    private List<Component> children = new ArrayList<Component> ();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int dept) {
        System.out.println(String.join("", Collections.nCopies(dept,"-")) + name);
        for (Component child : children) {
            child.display(dept +2);
        }
    }
}
