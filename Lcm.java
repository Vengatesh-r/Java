package com.basic.pkg;

public class Lcm
{
	
 public static void main(String[] args) 
 {
	Lcm lm=new Lcm();
	lm.find_lcm(3,9);
 }
private void find_lcm(int no1,int no2) {
	int big =no1>no2?no1:no2;
	int count=0;
	while(count<3)
	{
		if (big%no1==0 && big%no2==0)
		{
			System.out.println("Lcm" + big);
			count++;
		}
		big++;
	}	
}	
}	
	
	
	
	
	

