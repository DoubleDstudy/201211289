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
		Rectangle r1 = new Rectangle(30,40);
		Rectangle c1 = new Cube(40,50,60);
		Rectangle[] arrR = {r,c,r1,c1};
		
		for(int i =0; i < arrR.length;i++){
			s.select(arrR[i]);
		}
		
		
	}

}

