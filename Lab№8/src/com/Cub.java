package com;

public class Cub implements GeometricBody {
    private int x;
    Cub(int x) { this.x=x;}

    public double getSurface() {
        return 6*(x*x);
    }

    public double getVolume() {
        return x*x*x;
    }
}
