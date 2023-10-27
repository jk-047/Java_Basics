package com.basics.polymorphism;

//method overloading
public class CompileTimeBinding {
	
	public void add(int a, int b)
	{
		int result = a+b;
		System.out.println(result);
	}

	public void add(float a, float b)
	{
		System.out.println(a+b);
	}
	
	public void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		
		CompileTimeBinding ct = new CompileTimeBinding();
		
		ct.add(2.45f, 5.55f);
		ct.add(4, 5);
		ct.add(1, 2, 3);
		
		
	}

}
