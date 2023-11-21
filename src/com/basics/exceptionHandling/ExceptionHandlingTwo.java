package com.basics.exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandlingTwo {
	
		
	static void exceptionThree()
	{
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		try {
			int n = Integer.parseInt(s);
				
			int[] arr = new int[n];
			for(int i=0;i<n;i++)				
			{
				System.out.println("Enter array values:");
				arr[i] = sc.nextInt();
			}
			for(int i=0;i<=n;i++)
			{
				System.out.println(arr[i]);
			}
		}catch(NumberFormatException e) // UnChecked type exception
		{
			System.out.println(e);
		}
		catch(Exception e) { //Using Exception class or Runtime Exception Class directly is not a good practice
			System.out.println(e);
		}
		
						
	}
	
	public void exceptionFour() throws FileNotFoundException
	{
		System.out.println("------------From exceptionFour method------------\n");
		FileInputStream file = new FileInputStream("");
	}
	
	// Throwing custom exceptions
	static void exceptionFive()
	{
		throw new RuntimeException("Funds Insufficient!");
	}
	
	public void exceptionSix() {
		try {
			throw new Exception("Exception from exceptionSix method");
		}
		catch(Exception e)
		{
			
		}
		
	}

	public static void main(String[] args) {
		
		ExceptionHandlingTwo exception = new ExceptionHandlingTwo();
		
		ExceptionHandlingTwo.exceptionThree();
		
		try {
			
			exception.exceptionFour();
		
		} catch (FileNotFoundException e) { // Checked Exception
			
			System.out.println("File not Found!");
//			e.printStackTrace();
		}
		
		ExceptionHandlingTwo.exceptionFive();
		
			exception.exceptionSix();
			
	}

}
