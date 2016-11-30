package com.sm.ch8;
public class p6_Rectangle extends p6_Shape {
	private double width, height, area, perimeter;
	public p6_Rectangle(double width, double height){
		this.width = width;
		this.height = height;
		this.area = width*height;
		this.perimeter = 2*(width+height);
	}
	public double calcArea(){
		return this.area;
	}
	public double calcPerimeter(){
		return this.perimeter;
	}
	public String toString(){
		return "Rectangle..."+super.toString();
	}
}