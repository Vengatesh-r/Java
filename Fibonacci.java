package com.basic.pkg;

public class Fibonacci {

	public static void main(String [] args) {
		Fibonacci fibo=new Fibonacci();
		fibo.print_fibo(0,1);
}

	private void print_fibo(int first, int second) 
	{
		int count=1;
		while(count<=10) 
		{
	System.out.println(first);

	//int third =first + second;
	second=second+first;
	first = second-first;
	count++;
		
		
	}

}
}

