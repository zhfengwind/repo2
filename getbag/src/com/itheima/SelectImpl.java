package com.itheima;

public class SelectImpl implements Select {

    @Override
    public void selectBag(Bag bag) {
        System.out.println("女士选"+bag.getColor()+bag.getShape()+"包包");
    }
}
