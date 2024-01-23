package com.basic.pkg;

public class Gcd {

	public static void main(String[] args) {
	Gcd gcd=new Gcd();
	gcd.find_gcd(100,60);
}

	private void find_gcd(int no1,int no2) {
		// TODO Auto-generated method stub
		int div=2;
		int gcd=0;
		int small=no1<no2?no1:no2;
		while(div<=small)
		{
			if(no1%div==0 && no2%div==0)
			{
				gcd=div;
			}
			div++;
		}
		System.out.println(gcd);
	}
	

}
