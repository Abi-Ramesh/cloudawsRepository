package com.capg; //child class1

public class Circle extends Shapes { //extending from shapes
	int radius;
public Circle(int radius) { //using constructor
	this.radius=radius;
}
public void draw(){ //method1
	System.out.println("Circle");
}
public void calculateArea() { //method2
	System.out.println(3.14*radius*radius);
}

}
