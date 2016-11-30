package com.sm.ch8;
public abstract class p6_Shape {
	public String name = "Shape";
	  public abstract double calcArea();
	  public abstract double calcPerimeter();
	  public String getName(){return this.name;}
	  public String toString(){
	    return "Shape..."+super.toString();
	  }
	  	  
	  public static void main(String args[]){
		  p6_Rectangle r = new p6_Rectangle(3, 4);		  
		  p6_Circle c = new p6_Circle(5);
		  System.out.println("Rectangle Area : "+r.calcArea());
		  System.out.println("Cicle Area : "+c.calcArea());
		  
		  p6_Shape sr = new p6_Rectangle(4,5);
		  p6_Shape sc = new p6_Circle(6);
		  
		  System.out.println();
		  if(sr instanceof p6_Shape && sr instanceof p6_Rectangle){
			  System.out.println(sr.toString());
		  }
		  
		  if(sc instanceof p6_Shape && sc instanceof p6_Shape){
			  System.out.println(sc.toString());
		  }
		  System.out.println();
		  if(sr.getClass()==p6_Rectangle.class){
			  System.out.println("sr.getClass()==p6_Rectangle.class is True!");
		  }
		  if(sc.getClass()==p6_Circle.class){
			  System.out.println("sc.getClass()==p6_Circle.class is True!!");
		  }
		  
		  p6_Shape[] s=new p6_Shape[2];
		  s[0]=r;
		  s[1]=c;
		  
		  System.out.println();
		  for(p6_Shape my:s){
			  System.out.println(my.toString());
		  }
	  }
}