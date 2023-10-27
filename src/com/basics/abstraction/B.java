package com.basics.abstraction;

public class B implements A{

	@Override
	public void start() {
		System.out.println("inside start method");
	}

	@Override
	public void stop() {
		System.out.println("inside stop method");
	}
	
	public void display() {
		System.out.println("Inside dispay methid");
	}
	
	public static void main(String[] args) {
		
//		up casting
		A a = new B(); // object 'a' is of Interface A type which does nt have display method.
		a.start();
		a.stop();
		
//		down Casting
		B b = (B) a; // it is converted explicitly into type B which has display method and it can be invoked now.
		b.start();
		b.stop();
		b.display();
		
		
	}
	

}
