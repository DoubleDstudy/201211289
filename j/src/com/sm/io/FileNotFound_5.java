package com.sm.io;

import java.io.*;
import java.util.Scanner;

public class FileNotFound_5 {
	
	public static void main(String[] args) {
		try{
			File f=new File("noname.txt");
	        	FileReader fr=new FileReader(f);
		}
		catch(FileNotFoundException e){
			System.out.println("File Not Found!!");
		}
	}
}