package com.basic.pkg;

public class Chocolate {

	public static void main(String[] args) {
		int rupees=15;
		int chocolate=0;
		for(;rupees>0;rupees--) {
chocolate=chocolate+1;
if(chocolate%3==0) 
{
	chocolate++;
}

	}
System.out.println(chocolate);
}
}