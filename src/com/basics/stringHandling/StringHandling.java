package com.basics.stringHandling;

public class StringHandling {

	public static void display(String s1, String s2, String s3, String s4) {
		System.out.println(s1 == s2); // MEMORY LOCATIONS ARE COMPARED
		System.out.println("S1.EQUALS(S2) :" + s1.equals(s2)); // STRING CONTENTS ARE COMPARED

		System.out.println(s1 == s3);
		System.out.println("S1.EQUALS(S3) :" + s1.equals(s3));

		System.out.println(s1 == s4);
		System.out.println("S1.EQUALS(S4) :" + s1.equals(s4));

		String str = s1.concat(s3);
		System.out.println(str);
	}

	public static void stringMethods(String s1) {
		System.out.println("String = " + s1);
		System.out.println("String Length: " + s1.length());
		System.out.println("index of character 't': " + s1.indexOf('t'));
		System.out.println("character at 4th index: " + s1.charAt(4));

		System.out.println("Substring with index 3 to end of string: " + s1.substring(3));
		System.out.println("Substring with given indexes (2,7): " + s1.substring(2, 7)); // gives string from (n,m-1)

		StringHandling.moreMethods(s1);
	}
	
	public static void moreMethods(String s1)
	{
		String[] split = s1.split(" "); // returns string array
		System.out.println("String after split: " + split); // gives location

		// print each value in string array
		for (String i : split) {

			System.out.println(i);
		}

		System.out.println("String replaced with 'b': " + s1.replace('B', 'b'));

		System.out.println("String to Uppercase: " + s1.toUpperCase());
		System.out.println("String to lowercase: " + s1.toLowerCase());
	}
	

	public static void main(String[] args) {

		String s1 = "abc"; // string pooling
		String s2 = "abc"; // s1 and s2 share same location

		String s3 = "xyz";
		String s4 = new String("abc"); // new memory location is assigned

		StringHandling.display(s1, s2, s3, s4);
		System.out.println();
		StringHandling.stringMethods("Bangtan Sonyeondan");

	}

}
