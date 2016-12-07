package com.sm.io;

import java.util.Scanner;
import java.util.*;

public class CalcAreaMain_1{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("input r : ");
         double r = sc.nextDouble();
         double area = Math.PI*Math.pow(r,2);
         System.out.printf("r : %.2f area : %.2f",r,area);      	
    }
}