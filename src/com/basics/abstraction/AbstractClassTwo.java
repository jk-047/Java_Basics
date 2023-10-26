package com.basics.abstraction;

public class AbstractClassTwo extends AbstractClassOne {
	
//	if an abstract class inherits another abstract class, then method overriding is not necessary.
//	but if the class inheriting an abstract class is not an abstract class then abstract methods need to be overridden.

	public void common()
	{
		super.common1();
	}
	public void common1()
	{
		System.out.println("from class 2");
	}
	
	@Override
	void limited() {
		System.out.println("from abstract class 2");
	}
	


}
