package com.basic.pkg;

public class Recursion_gone_wrong {
	
	void display()
	{
	System.out.println("hello");	
		display();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion_gone_wrong ob=new Recursion_gone_wrong();
		ob.display();
		
	}

}
