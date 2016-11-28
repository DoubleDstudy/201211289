package com.sm.ch8;

public class Turtle {

	  protected int nLimbs = 4;
	  protected String food;
	  
	  public void setFood(String f){
	    this.food = f;
	  }
	  
	  public void setNlimbs(int number){
		  this.nLimbs = number;
	  }
	  
	  public void getNlimbs(){
		  System.out.println("I have "+nLimbs+"!!!");
	  }
	  
	  public void eat(){
	    System.out.print("Turtle eats "+ food);
	  }
	  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeaTurtle se = new SeaTurtle();
		LandTurtle lt = new LandTurtle();
		Turtle t = new Turtle();
		
		se.getNlimbs();
		lt.getNlimbs();
		t.getNlimbs();
		
		se.setNlimbs(8);
		lt.setNlimbs(8);
		t.setNlimbs(8);
		System.out.println("set Change!");
		se.getNlimbs();
		lt.getNlimbs();
		t.getNlimbs();
		
		
	}

}
