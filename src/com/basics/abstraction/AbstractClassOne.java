package com.basics.abstraction;

//abstract classes have both concrete methods and abstract methods and are specified with abstract keyword before class
public abstract class AbstractClassOne {
	
	public void common1() {
		System.out.println("this is same for all");
	}
	
//	abstract methods do not have body and the implementation is added later in the child classes
	abstract void limited(); 

}
