package com.basic.pkg;

public class Recursion_print_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion_print_no rp=new Recursion_print_no();	
		int no=1;
	//	rp.print(no);
		int i=5;
		while(i>0) {
		int c=rp.print1(i);
		System.out.println(c);
		i--;
		}
	}
	private int print1(int i) {
		// TODO Auto-generated method stub
		if(i==1)
			return 1;
		else
			return(i*print1(i-1));
	}
	private void print(int no) {
		// TODO Auto-generated method stub
		System.out.println(no);
		no=no+2;
		if(no<=100) {
				print(no);
	}
	}
}
