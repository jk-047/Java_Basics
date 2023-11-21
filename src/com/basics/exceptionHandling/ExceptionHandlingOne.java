package com.basics.exceptionHandling;

import java.util.Scanner;

public class ExceptionHandlingOne {
	
	 void exceptionOne()
	{
		System.out.println("enter two numbers:");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try {
			
			int result = a/b;
			System.out.println(result);
			
		}catch(ArithmeticException e) // Runtime Exception
		{
			System.out.println("Arithmetic Exception");
			System.out.println(e);
		}
	}
	
	public void exceptionTwo()
	{
		String s ="abc";
		
		try {
			
			int i = Integer.parseInt(s);
			
		}catch(NumberFormatException e)
		{
			System.out.println("cant convert string to number");
			System.out.println(e);
		}
				
	}
	
	static void exceptionThree()
	{
		int arr[] = {1,2,3};
		
		try {
			
			for(int i=0;i<=4;i++)
			{
				System.out.println(arr[i]);
			}
			
		}
		catch(Exception e) //ArrayIndexOutOfBoundsException
		{
			System.out.println(e);
			System.out.println("Keep it within array boundaries");
		}
				
	}

	public static void main(String[] args) {
		
		ExceptionHandlingOne exception = new ExceptionHandlingOne();
		
		exception.exceptionOne();
		exception.exceptionTwo();
		ExceptionHandlingOne.exceptionThree();
		
		
		

	}

}
