package com;

public class Square extends Figure {
    private int x;

    Square (int x){
        this.x = x;
    }

    public double getPerimeter(){

        return 4*x;
    }

    public double getArea(){

        return x*x;
    }
}
