package com.basics.multiThreading;

public class SingleThreading {
	
	public void display()
	{
		System.out.println("inside display method");
		
		for(int i=0;i<10;i++)
		{
			System.out.println("i= "+i);
		}
	}

	public static void main(String[] args) {

//		In Single threading all are run in same Thread. no new threads are created for program execution
//		program execution starts with main method and all the other methods are run one after another.
		
		SingleThreading single = new SingleThreading();
		single.display();
		
		System.out.println("inside main method");
		
		for(int i=0;i<10;i++)
		{
			System.out.println("j= "+i);
		}
		
	}

}
