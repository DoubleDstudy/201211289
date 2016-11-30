package com.sm.ch8;

public abstract class p4_Shape {
	  public String name = "Shape";
	  public abstract double calcArea();
	  public abstract double calcPerimeter();
	  public String getName(){return this.name;}
	  public String toString(){
	    return "Shape..."+super.toString();
	  }
	  	  
	  public static void main(String args[]){
		  p4_Rectangle r = new p4_Rectangle(3, 4);		  
		  p4_Circle c = new p4_Circle(5);
		  System.out.println("Rectangle Area : "+r.calcArea());
		  System.out.println("Cicle Area : "+c.calcArea());
	  }
}
