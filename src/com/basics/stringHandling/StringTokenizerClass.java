package com.basics.stringHandling;

import java.util.StringTokenizer;

public class StringTokenizerClass {

	public static void main(String[] args) {

//		String str = "Hello, we are BTS!";
		String str = "Hello,we,are,BTS!";
		
//		StringTokenizer tokens = new StringTokenizer(str);
		StringTokenizer tokens = new StringTokenizer(str,","); // used when string contains a different delimiter than (\n,\t,\r,\f)
		
		while(tokens.hasMoreTokens())
		{
			System.out.println(tokens.nextToken());
		}
		
	}

}
