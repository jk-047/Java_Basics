package com.basics.inheritance;

public class SingleInheritance {
	
//	by default the classes inherit object class from java.lang package. this explains why 
//	we are able to use the methods hashcode and getClass even when not mentioning them explicitly
	
	public void method1() {
		System.out.println("inside method1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleInheritance s = new SingleInheritance();
		s.method1();
		s.hashCode();
		s.getClass();

	}

}
