package com.basics.five;

import java.util.Scanner;

public class ScannerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		calculating sum & product of two numbers through console input
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers:");
		
		int num1 = Integer.parseInt(sc.next());
		int num2 = Integer.parseInt(sc.next());
		
		int result = num1 + num2;
		
		System.out.println("Sum of number is: " + result);
		
		System.out.println("Enter two numbers to product:");
		
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		
		int product = num3*num4;
		
		System.out.println("product of the numbers: " + product);
		

	}

}
