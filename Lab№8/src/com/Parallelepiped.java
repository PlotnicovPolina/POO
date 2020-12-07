package com;

public class Parallelepiped implements GeometricBody {
    private int x,y,z;
    Parallelepiped(int x,int y,int z) {
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public double getSurface() {
        return 2*(x*y+y*z+x*z);
    }

    public double getVolume() {
        return x*y*z;
    }
}