package com.itcast;

public abstract class Shape {
    Color color;
    void setColor(Color send){
        this.color = send;
    }

    abstract void draw();
}
