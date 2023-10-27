package com.basics.polymorphism;

// method overriding
public class DynamicBinding extends A {
	
	@Override
	void display() {
		
		System.out.println("overriden display method");
		
	}
	public static void main(String[] args) {
		
		DynamicBinding d = new DynamicBinding();
		d.display();

	}

}
