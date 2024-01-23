package com.basic.pkg;

public class Pattern_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char row ='A';row<='I';row=(char) (row+2)) {
for(char  col=row;col<='I'; col=(char) (col+2)) {
	System.out.print(col+" ");
	}
System.out.println();
}
		
	}
}