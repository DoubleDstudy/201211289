package com.sm.ch8;

public class Circle extends Point {
		
	private double radius = 3.14159265358979;
	private double halfLength;
	
	public Circle(int x, int y, double halfLength) {
		super(x, y);
		this.halfLength = halfLength;		
	}
	
	public double getArea(){	
		double area = radius*halfLength*halfLength;
		return area;		
	}
	
}