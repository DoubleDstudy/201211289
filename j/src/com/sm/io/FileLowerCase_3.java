
package com.sm.io;

import java.io.*;
import java.util.Scanner;

public class FileLowerCase_3 {
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner f=new Scanner(new File("test.txt"));
		String line = f.nextLine();
		System.out.println(line.toLowerCase());

	}

}