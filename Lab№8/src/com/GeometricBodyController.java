package com;

import java.util.ArrayList;

public class GeometricBodyController {
    public static GeometricBody MaxSurface(ArrayList<GeometricBody> geometricBodies){
        int index=0;
        double surface=0;

        for (int i = 0; i < geometricBodies.size(); i++) {
            if (geometricBodies.get(i).getSurface()>surface) { surface=geometricBodies.get(i).getSurface(); index=i; }
        }

        return geometricBodies.get(index);
    }
    public static GeometricBody MaxVolume(ArrayList<GeometricBody>geometricBodies){
        int index=0;
        double volume=0;

        for (int i = 0; i < geometricBodies.size(); i++) {
            if (geometricBodies.get(i).getVolume()>volume) { volume=geometricBodies.get(i).getVolume(); index=i; }
        }

        return geometricBodies.get(index);
    }
}
