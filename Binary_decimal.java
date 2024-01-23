package com.basic.pkg;

public class Binary_decimal {

	public static void main(String[] args) {
	Binary_decimal bd=new Binary_decimal();
	bd.split_digit(1011);
	
	}
	private void split_digit(int binary) {
		int p=0;
		int decimal=0;
	while(binary>0)
	{
		int rem=binary%10;
		int result=rem*find_power(2,p);
		p=p+1;
		decimal=decimal+result;
		//System.out.println(result);
		binary=binary/10;
	}
System.out.println(decimal);

}

	private int find_power(int base, int power) {
		
	int no=1;
	while(power>0)
	{
		no=no*base;
		power=power-1;
	}
//System.out.println(no);
return no;
}	

	
	
}