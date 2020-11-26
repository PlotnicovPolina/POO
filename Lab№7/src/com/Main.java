package com;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	Square square=new Square(4);
	Rectangle rectangle= new Rectangle(5,8);
	Triangle triangle = new Triangle(7,5,2);
	ArrayList<Figure> Figures = new ArrayList();
	Figures.add(square);
	Figures.add(triangle);
	Figures.add(rectangle);
	Figure maxA = FigureController.MaxArea(Figures);
	System.out.println("Max area:"+ maxA.getArea());
	Figure maxP = FigureController.MaxPerimeter(Figures);
	System.out.println("Max perimeter:"+ maxP.getPerimeter());
		Figure Circle = new Figure() {

			private int r=8;

			@Override
			public double getPerimeter() {
				return 2*Math.PI*r;
			}

			@Override
			public double getArea() {
				return r*r*Math.PI;
			}
		};
	Figures.add(Circle);
		Figure maxAafC = FigureController.MaxArea(Figures);
		System.out.println("Max area after adding circle:"+ maxAafC.getArea());
		Figure maxPafC = FigureController.MaxPerimeter(Figures);
		System.out.println("Max perimeter after adding circle:"+ maxPafC.getPerimeter());
    }
}
