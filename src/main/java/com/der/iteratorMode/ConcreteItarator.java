package com.der.iteratorMode;

/**
 * @ClassName ConcreteItarator
 * @Desctiption TODO
 * @Author 曹世龙
 * @Date 2019/7/18 22:53
 * @Version 1.0
 **/
public class ConcreteItarator extends Iterator {

    private ConcreteAggreagte aggreagte;

    private int current = 0;

    public ConcreteItarator(ConcreteAggreagte aggreagte) {
        this.aggreagte = aggreagte;
    }

    @Override
    public Object first() {
        return aggreagte.get(0);
    }

    @Override
    public Object next() {
        current++;
        if (current < aggreagte.getCount()){
            return aggreagte.get(current);
        }
        return null;
    }

    @Override
    public boolean isDone() {
        return current >= aggreagte.getCount();
    }

    @Override
    public Object currentItem() {
        return aggreagte.get(current);
    }
}
