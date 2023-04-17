package com.java;
import java.util.*;
public class LineComparison {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison program");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the First co-ordinate of line");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		
		System.out.println("Enter the Second co-ordinate of line");
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		
		double x=Math.pow((x2-x1),2);
		double y=Math.pow((y2-y1),2);
		int l1=(int) Math.sqrt(x+y);
		
		System.out.println("Length of line is "+l1);
        sc.close();
	}

}
