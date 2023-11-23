package com.basics.multiThreading;

import java.util.Scanner;

public class JoinExample extends Thread {
	
	static int n, total;

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Enter n value: ");
		Scanner sc = new Scanner(System.in);
		
		JoinExample.n = sc.nextInt();
		
		JoinExample join = new JoinExample();
		
		join.start(); // thread initialization
		
		Thread currentThread =Thread.currentThread();
		System.out.println("thread id = "+currentThread.getId()+" THread name = "+currentThread.getName());
		
		join.join(); // waits for thread to complete and then prints the total
		
		System.out.println("Sum of n numbers= "+ JoinExample.total);
			
	}
	
	@Override
	public void run() 
	{
		Thread currentThread =Thread.currentThread();
		System.out.println("thread id = "+currentThread.getId()+" THread name = "+currentThread.getName());
		currentThread.setName("Sum calculation thread");
		System.out.println("thread id = "+currentThread.getId()+" THread name = "+currentThread.getName());
		
		for(int i=1;i<=JoinExample.n;i++)
		{
			JoinExample.total+=i;
			try 
			{
				Thread.sleep(500);
			} 
			catch (InterruptedException e) 
			{
				System.out.println(e);
			}
			System.out.println("i= "+i);
		}
	}

}
