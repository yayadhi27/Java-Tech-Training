package com.Jaya;

public class ShapeUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape[] shapes = new Shape[4];
		shapes[0] = new Circle("green",9);
		shapes[1] = new Rectangle("orange",9,4);
		shapes[2] = new Rectangle("yellow",11,4);
		shapes[3] = new Circle("violet",11);
		
		for(Shape s: shapes) {
			s.showColor();
			s.calArea();
			s.print();
		}
	}

}
