package com.sm.ch8;

public class Selection {

	Selection(){
		System.out.println("First : Rectangle! Second : Cube!");		
	}
		
	public void select(Rectangle r){
		r.setSelected(true);
		System.out.println("selected : "+ r.isSelected);
	}
	
	public static void main(String[] args) {
		Selection s = new Selection();
		Rectangle r = new Rectangle(20,30);			
		Rectangle c = new Cube(30,40,50);
		s.select(r);
		s.select(c);
		
	}

}
