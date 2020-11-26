package com;

public class Triangle extends Figure {
    private int x;
    private int y;
    private int z;
    int p;
    Triangle (int x, int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getPerimeter(){

        return x+y+z;
    }

    public double getArea(){
        p=(x+y+z)/2;
        return Math.sqrt(p*(p-x)*(p-y)*(p-z));
    }
}
