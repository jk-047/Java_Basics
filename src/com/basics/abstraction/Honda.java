package com.basics.abstraction;

public class Honda implements Car {

	@Override
	public void go() {

		System.out.println("GO from honda class");
		
	}

	@Override
	public void stop() {
		
		System.out.println("STOP from honda class");
		
	}
	
	public static void main(String[] args) {
		
		Honda honda = new Honda();
		
		honda.go();
		honda.stop();
		
		
	}

}

