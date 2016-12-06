package com.sm.yut;
import java.util.Scanner;

public class Main {  
	  
   
  	 public static void main(String[] args){  
  		 while(true){
  			 Scanner s1 = new Scanner(System.in);
  	  		 System.out.println("Dice : 1 or yut : 2 exit : 3");
  	  		 int selectnumber = s1.nextInt();  	  
  	  		 if(selectnumber == 3 ){
  	  			 System.out.println("Bye~");
  	  			 break;
  	  		 }
  	  		 Scanner s2 = new Scanner(System.in);
 	  		 System.out.print("press user1 name : ");
 	  		 String playerName1 = s2.next();
 	  		 System.out.print("press user2 name : ");
 	  		 String playerName2 = s2.next();
 	  		 System.out.println();
  	  		 if(selectnumber == 1){  			
  	  			 DiceGame d = new DiceGame(playerName1,playerName2);
  	  			 d.startGame();
  	  		 }else if(selectnumber == 2){
  	  			GameGui gu = new GameGui(playerName1,playerName2);  	  			
  	  			
  	  		 }  	  		 
  		 }  		 
  	 }     
  }  