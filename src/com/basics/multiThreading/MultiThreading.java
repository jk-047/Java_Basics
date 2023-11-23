package com.basics.multiThreading;

public class MultiThreading extends Thread {

	public static void main(String[] args) throws InterruptedException {
		
//		to implement multi threading, we extend Thread class. this class has run method that nees to be overriden to 
//		implement multi threading. all the code the should execute goes into the run method.
		
		MultiThreading multi = new MultiThreading(); // object of the class
		multi.start(); // creates another thread and executes run method on the newly created thread.
		
//		execution is swapped between the two threads
		
		
		System.out.println("inside main method");
		
		for(int i=0;i<50;i++)
		{
			System.out.println("j= "+i);
//			Thread.sleep(500);
		}
		
		multi.join(); // join method waits till the execution of the thread is completed or the thread goes dead and then
//					continues the program execution
		//k will not be printed until the thread execution is done.
		
		for(int i=0;i<5;i++)
		{
			System.out.println("k= "+i);
		}
		
	}
	
	@Override
	public void run() {
		
		System.out.println("inside run method");
		
		for(int i=0;i<50;i++)
		{
			System.out.println("i= "+i);
			
//			sleep method puts the thread in which it is invoked on into sleep for the given time in milli seconds
			try 
			{
				Thread.sleep(1000); 
			} 
			catch (InterruptedException e) 
			{
				System.out.println(e);
			}
		}
	}

}
