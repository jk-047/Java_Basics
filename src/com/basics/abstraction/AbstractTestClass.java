package com.basics.abstraction;

public class AbstractTestClass {

	public static void main(String[] args) {
		
//		instance of abstract class cannot be created.
		
		AbstractClassTwo abs = new AbstractClassTwo();
		
		abs.common1();
		abs.common();
		abs.limited();
		
	}

}
