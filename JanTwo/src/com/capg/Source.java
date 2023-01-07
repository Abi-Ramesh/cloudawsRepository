package com.capg;

public class Source {

	public static void main(String[] args) {
		Shapes rect=new Rectangle(12,14);
		rect.draw();
		rect.calculateArea();
		Shapes circle= new Circle(12);
		circle.draw();
		circle. calculateArea();
	}

}
