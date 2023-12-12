package com.basics.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListClass {
	
	public static void methodOne()
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(30);
//		list.add("Amrutha");
		list.add(25);
		

		System.out.println(list);
	}
	
	public static void methodTwo()
	{
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<=10;i++)
		{
			list.add(i);
		}
		
		System.out.println("list : " + list);
		list.add(2,100);
		System.out.println("list after insert : "+ list);
		list.set(1, 20);
		System.out.println("list after replace : "+ list);
	}
	
	public static void methodThree()
	{
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		for(int i=0;i<=10;i++)
		{
			list1.add(i);
		}
		
		list2.add(20);
		list2.add(30);
		list2.add(40);
		
		list1.addAll(list2); // appends the list2 at the end of list1
		
//		list1.addAll(4, list2); // appends the list2 at the specified index
		
		System.out.println("list1 + list2 : "+list1);
		
		if(list1.contains(202))
		{
			System.out.println("value exists");
		}
		else
		{
			System.out.println("value does not exist");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayListClass.methodOne();
		ArrayListClass.methodTwo();
		ArrayListClass.methodThree();
		
	}

}
