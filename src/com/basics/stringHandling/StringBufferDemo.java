package com.basics.stringHandling;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer();
		System.out.println("Initial capacity: " + sb.capacity());

		sb.append("Hello World!\n");
		sb.append("Hello! we are BTS!");

		System.out.println(sb);
		System.out.println("Current capacity: " + sb.capacity());
		System.out.println(sb.charAt(13));
		System.out.println(sb.indexOf("T"));

		System.out.println("insert at index 6: " + sb.insert(6, "fishing"));

		System.out.println("delete chars between 6 and 14: " + sb.delete(6, 14)); // (n,m-1) indexes are deleted
		System.out.println("reverse: " + sb.reverse());
		
	}

}
