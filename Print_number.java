package com.basic.pkg;

public class Print_number {

	public static void main(String[] args) {
	int no2=5;
	boolean first =true;
 for(int no=1;no<=5;no++) {
System.out.println(no*no2);
  if( no==5 && first==true) {
	  no2=4;
	  no=0;
	 first=false;
  }
	}
}
	
}
