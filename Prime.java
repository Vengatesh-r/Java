package com.basic.pkg;

public class Prime {
	
	int prime_count=0;
	public static void main(String[] args) {
	Prime pp =new Prime();
	pp.find_prime(2);

	}

	private void find_prime(int no) 
	{
	int div=2;
	int count=0;
	
	while(div<= no/2)
	{
		if(no%div==0) 
		{
		 //System.out.println("not prime");
		 count=count+1;
		 break;
		}
		div=div+1;
	
	}
	if(count==0)
	{
		System.out.println(no+"prime");
		prime_count=prime_count+1;
	}
	if(prime_count<5)
	{
		 no=no+1;
find_prime(no);
	
	}
	}
	
	}


