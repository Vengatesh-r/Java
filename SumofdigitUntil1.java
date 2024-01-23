package com.basic.pkg;

public class SumofdigitUntil1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=436474;
		int sum=0;
		while(no>0 || sum>9) {
			if(no==0)
			{
			no=sum;	
			sum=0;
			}
			int rem=no%10;
			sum=sum+rem;
			no=no/10;	
		}
		System.out.println(sum);
	}

}
