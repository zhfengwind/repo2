package com.itcast;

public class Main {
    public static void main(String[] args) {
        Black_Color black_color = new Black_Color();
        Long_Shape long_shape = new Long_Shape();
        long_shape.setColor(black_color);
        long_shape.draw();
    }
}
