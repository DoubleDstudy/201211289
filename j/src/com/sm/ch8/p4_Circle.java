package com.sm.ch8;

public class p4_Circle extends p4_Shape {
	
	private double radius =  3.14159265358979;
	private double halfLength,area,perimeter;
	public p4_Circle(double halfLength){
		this.halfLength = halfLength;
		this.area = halfLength*halfLength*radius;
		this.perimeter = 2*(radius*halfLength);
	}	
	public double calcArea() {		
		return area;
	}	
	public double calcPerimeter() {		
		return perimeter;
	}
	public String toString(){
		return "Circle..."+super.toString();
	}
}