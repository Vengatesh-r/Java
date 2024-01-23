package com.basic.pkg;

public class Pattern_d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char row='E';row>='A';row--) {
			for(char col='A';col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}

	}

}
