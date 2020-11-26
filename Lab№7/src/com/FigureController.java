package com;
import java.util.ArrayList;

public class FigureController {
    public static Figure MaxArea(ArrayList<Figure> Figures){
        int index=0;
        double area=0;

        for (int i = 0; i < Figures.size(); i++) {
            if (Figures.get(i).getArea()>area) { area=Figures.get(i).getArea(); index=i; }
        }

        return Figures.get(index);
    }
    public static Figure MaxPerimeter(ArrayList<Figure>Figures){
        int index=0;
        double perimeter=0;

        for (int i = 0; i < Figures.size(); i++) {
            if (Figures.get(i).getPerimeter()>perimeter) { perimeter=Figures.get(i).getPerimeter(); index=i; }
        }

        return Figures.get(index);
    }
}

