package com.itheima;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SelectImpl select = new SelectImpl();
        String color1 = "白色";
        String color2 = "蓝色";
        String color3 = "黑色";
        String shape1 = "长方形";
        String shape2 = "圆形";
        String shape3 = "三角形";
        Bag bag = new Bag(color1, shape1);
        select.selectBag(bag);
    }
}
