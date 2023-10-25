package com.basics.inheritance;

public class ChildClass extends ParentClass {
	
	int c, d;
	
	ChildClass(int c, int d, int a, int b)
	{
		super(a,b);
		this.c = c;
		this.d = d;
	}
	
	void display()
	{
		System.out.println(this.c);
		System.out.println(super.a);
		System.out.println(this.d);
		System.out.println(super.b);
	}
	
	
	void f1() {
		System.out.println("inside child f1");
		super.f1();
	}

}
