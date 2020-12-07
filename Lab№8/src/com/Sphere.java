package com;

public class Sphere implements GeometricBody {
    private int r;
    Sphere(int r) { this.r=r;}

    public double getSurface() {
        return 4*Math.PI*r*r;
    }

    public double getVolume() {
        return (4/3)*Math.PI*r*r*r;
    }
}