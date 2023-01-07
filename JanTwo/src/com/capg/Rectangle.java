package com.capg; //child class2

public class Rectangle extends Shapes {
	int l,b;
	public Rectangle(int l,int b) {
		this.l=l;
		this.b=b;
	}
	
	
	public void draw(){
		System.out.println("Rectangle");	
	
	}
	public void calculateArea(){
		System.out.println(l*b);
	}
	}	


