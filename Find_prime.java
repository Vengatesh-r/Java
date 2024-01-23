package com.basic.pkg;

public class Find_prime {
	int prime_count=0;

	public static void main(String[] args) {
		Find_prime fd=new Find_prime();
	for(int no=2;no<=100;no++) {
		fd.prime_number(no);
	}	
	System.out.println(fd.prime_count);

	}
	private void prime_number(int no) {
		boolean prime=true;
		
		//int count=0;
		for(int div=2;div<=no/2;div++) {
		if(no%div==0) {
		//count++;
			prime=false;
		break;
	}
		}
if(prime==true) {
	prime_count++;
	System.out.println(no +" "+"prime");
	}
	}
}