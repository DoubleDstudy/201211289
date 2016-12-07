
package com.sm.io;

import java.io.*;
import java.util.Scanner;

public class ScannerFile_2 {
	
	public static void main(String[] args) throws FileNotFoundException {		
		Scanner f=new Scanner(new File("test.txt"));
		String line = f.nextLine();
		System.out.println(line);

	}

}
