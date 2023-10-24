package com.basics.three;

import com.basics.four.AccessModifiers1;

public class AccessModifiers3 extends AccessModifiers1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessModifiers1 obj = new AccessModifiers1();
		
		System.out.println(obj.d);
		
//		a, b and c variables cant be accessed. to access c, we need the instance of the extending class
		
		AccessModifiers3 obj1 = new AccessModifiers3();
		
		System.out.println(obj1.c);
		System.out.println(obj1.d);
		

	}

}
