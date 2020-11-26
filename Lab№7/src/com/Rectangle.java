package com;

public class Rectangle extends Figure {
    private int x;
    private int y;

    Rectangle (int x, int y){
        this.x = x;
        this.y = y;
    }

    public double getPerimeter(){

        return x * 2 + y * 2;
    }

    public double getArea(){

        return x * y;
    }
}
