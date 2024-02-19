package com.Jaya;

public abstract class Shape implements Printable {
	String color;
	public abstract void calArea();
	
	public Shape(String color) {
		super();
		this.color = color;
	}

	public Shape() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void showColor() {
		System.out.println("Colour is:"+color);
		
	}
}

class Circle extends Shape {
	int r;
	@Override
	public void calArea() {
		System.out.println("Area is "+(3.14*r*r));
	}
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Circle(String c, int r) {
		super(c);
		this.r = r;
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Circle");
	}
}

class Rectangle extends Shape {
	int length;
	int width;
	@Override
	public void calArea() {
		System.out.println("Area is "+(length*width));
		
	}
	
	public Rectangle() {
		super();
	}

	public Rectangle(String c, int length, int width) {
		super(c);
		this.length = length;
		this.width = width;
	}


	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle");
	}
}
