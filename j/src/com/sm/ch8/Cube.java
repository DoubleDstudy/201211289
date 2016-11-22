package com.sm.ch8;

public class Cube extends Rectangle {

	protected double height;
	public Cube(double l, double w, double h) {
		super(l, w);
		this.height = h;
	}

	public double getHeight(){
        return this.height;
    }
	
	public void setSelected(boolean b){
		System.out.println("Select Cube!");
		isSelected = b;
	}
	
	public boolean getSelected(){		
		return isSelected;
	}
	
}
