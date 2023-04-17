package com.java;

import java.util.Scanner;

public class LineComparisonUC3 {

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
		int L1=(int) Math.sqrt(x+y);
		
		System.out.println("Length of line is "+L1);
		
		System.out.println("Enter length of line 2");
		int L2=sc.nextInt();
		
		Integer obj1=new Integer(L1);
		Integer obj2=new Integer(L2);
		
		int result=obj1.compareTo(obj2);
		if (result > 0) {
			System.out.println("Length of line 1 is greater than Lenght of line 2");
		}
		else if(result <0) {
			System.out.println("Length of line 1 is smaller than length of line 2");
		}
		else {
			System.out.println("Lenght of line 1 is equal to length of line 2");
		}
		sc.close();
		}

	}

