package com.basic.pkg;

public class pattern_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int star=1;star<=6-row;star++) {
				System.out.print(" "+" ");
			}
			for(int no=1; no<=row;no++) {
				System.out.print(row+ " ");
			}
			System.out.println();
		}
		

	}

}
