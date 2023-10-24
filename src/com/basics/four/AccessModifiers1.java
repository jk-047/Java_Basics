package com.basics.four;

public class AccessModifiers1 {
	
	private int a =10;
	int b = 20;
	protected int c=30;
	public int d = 40;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessModifiers1 obj = new AccessModifiers1();
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		

	}

}
