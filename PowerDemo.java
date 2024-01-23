package com.basic.pkg;

public class PowerDemo {

	public static void main(String[] args) {
	
PowerDemo pd = new PowerDemo();
    //pd.find_power();
int no=1;
while(no<=5)
{
pd.find_power(no,3);
  no=no+1;
  }
	}

	private void find_power(int base, int power) {
		int no=1;
		while(power>0) {
		no=no*base;
		power=power-1;
		}
		System.out.println(no);
				
	}	
			
	}