package com.basics.three;

public class FlowControlStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=20, y=20;
		int ch =5; int i=5;
		
		if(x>y)
		{
			System.out.println("x is greater");
		}
		else {
			if(y>x)
			{
				System.out.println("y is greater");
			}
			else {
				System.out.println("x and y are equal");
			}
			
		}
		
		switch(ch)
		{
		case 1:
			System.out.println("case 1");
			break;
		case 2:
			System.out.println("case 2");
			break;
		default:
			System.out.println("default case");
						
		}
		
		while(i>0)
		{
			System.out.println(i);
			--i;
		}
		System.out.println("Do While");
		
		do {
			System.out.println(i);
			++i;
		}while(i<=5);
		
		System.out.println("for loop");
		
		for(i=0;i<10;i++)
		{
			System.out.println(i);
			
			if(i==5) {
				continue;
			}
			System.out.println("after continue " + i);
			
			if(i==7) {
				System.out.println("inside break\n");
				break;
			}
						
		}
		
		label1:
		{
			System.out.println("inside lable block ");
			if(x==20)
			{
				break label1;
			}
			System.out.println("after break");
		}
		System.out.println("outside label block");
		

	}

}
