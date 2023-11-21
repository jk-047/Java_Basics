package com.basics.exceptionHandling;

public class Test {

	public static void main(String[] args) throws ExceptionHandlingFour {
		// TODO Auto-generated method stub
		
//		in case of unchecked exceptions we do not need a try catch or a throws declaration 
//		throw new ExceptionHandlingThree("Unchecked Custom Exceptions");
		
		
//		in case of checked exceptions, throws declaration is needed. or a try catch block is mandatory
		throw new ExceptionHandlingFour("Checked Custom Exceptions");

		
	}

}
