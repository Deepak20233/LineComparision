package com.java;

import java.util.Scanner;

public class LineComparisionOops {	
	
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
		
		System.out.println("Length of line 1 is : "+ L1);
		
		System.out.println("Enter length of line 2 : ");
		int L2=sc.nextInt();
		
		LineComparisionOops obj= new LineComparisionOops();
		obj.CompareLines(L1,L2);

		sc.close();
		}

	private void CompareLines(int l1, int l2) {
		// TODO Auto-generated method stub
		Integer length1 = Integer.valueOf(l1);
		Integer length2 = Integer.valueOf(l2);
		int result=length1.compareTo(length2);
		if (result > 0) {
			System.out.println("Length of line 1 is greater than Lenght of line 2");
		}
		else if(result <0) {
			System.out.println("Length of line 1 is smaller than length of line 2");
		}
		else {
			System.out.println("Lenght of line 1 is equal to length of line 2");
		}
	}



}

