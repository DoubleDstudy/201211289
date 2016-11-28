package com.sm.ch8;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle myCircle = new Circle(10,10,5.0);
		System.out.println(myCircle.getArea());
		Double myArea = myCircle.getArea();
		System.out.println(myArea);
	}

}