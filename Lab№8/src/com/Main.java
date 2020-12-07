package com;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    Cub cub=new Cub(8);
    Parallelepiped parallelepiped=new Parallelepiped(4,8,5);
    Sphere sphere=new Sphere(5);
    ArrayList<GeometricBody> geometricBodies = new ArrayList();
    geometricBodies.add(cub);
    geometricBodies.add(parallelepiped);
    geometricBodies.add(sphere);
    GeometricBody MaxSurface= GeometricBodyController.MaxSurface(geometricBodies);
    System.out.println("Max surface:"+MaxSurface.getSurface());
    GeometricBody MaxVolume= GeometricBodyController.MaxVolume(geometricBodies);
    System.out.println("Max volume:"+MaxSurface.getVolume());

    }
}
