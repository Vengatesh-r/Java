package com.basic.pkg;

public class FizzBizz {

	public static void main(String[] args) {
for(int no=1;no<=50;no++)
		{
		
			if(no%3==0 && no%5==0)
				System.out.println("Fizz buzz");
		
			else if(no%5==0) 
		System.out.println("Fizz");
	
			else if (no%3==0) 
				System.out.println("buzz");
			
			else 
				System.out.println(no);
			
		}
	}
	}