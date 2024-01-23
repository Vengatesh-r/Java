package com.basic.pkg;

import java.util.Scanner;

public class ArraysDemo {
	public static void main(String[] args) {
			ArraysDemo ad=new ArraysDemo();	
	//ad.learning_1();
	//ad.learning_2();
	//ad.learning_3();
	//ad.learning_4();
	//ad.learning_5();
	//ad.learning_6();
	//ad.learning_7();
	//ad.learning_8();
	//ad.learning_9();
 // ad.learning_10();
	//ad.learning_11();
//	ad.learning_12();
	//ad.learning_13();//count or frequency of each character
	//ad.learning_14();//print high,second high,low,second low
	ad.learning_15();//print count any one,two or big with character
	//ad.learning_16();//addition of two arrays
//	ad.learning_17();//diffrent length array
	//ad.learning_18();//concatenation of arrays
//	ad.learning_19();//print no's adjacent element in array
//	ad.learning_20(); //print no's adjacent  element different
	//ad.learning_21();
	//ad.learning_22();//removal of duplicates from an ordered array
//	ad.learning_23();// sub array
ad.learniing_24();
	}

	private void learniing_24() {
		// TODO Auto-generated method stu
		  int [] ar= {10,23,32,41,55,65,87,89,90};
		  int search = 99;
		  int min=0,max=ar.length-1;
		  while(min<=max)
		  {
		   int mid=(min+max)/2;
		   if(search==ar[mid])
		   {
		    System.out.println(search+" Search is present at "+mid+" index");
		    break;
		   }
		   else if(search>ar[mid])
		   {
		    min=mid+1;
		   }
		   else if(search<ar[mid])
		   {
		    max=mid-1;
		   }
		   
		  }
		  
		  if(min>max)
		  {
		   System.out.println("Search is not Present");
		  }
	 }
	private void learning_23() {
		// TODO Auto-generated method stub
		int [] a= {20,10};
		int [] b= {10,20,30};
		//int count=0;
	//	int small= a.length<b.length?a.length:b.length;
		//int big= a.length>b.length?a.length:b.length;
		int j;
		for( j=0;j<a.length;j++) {
			boolean present=false;
			for(int i=0;i<b.length;i++) {
				if(a[j]==b[i]) {
				//	count++;
					present=true;
				}
			}
		if(present==false)	{
			System.out.println("not sub arry");
			break;
		}		
		}
		if(j==a.length) 
			System.out.println("sub arry");
		}
	

	private void learning_22() {
		// TODO Auto-generated method stub
		int[] ar= {20,30,30,40,50,50,50,60,60,70};
		int unique=1;
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i]!=ar[i+1]) {
				ar[unique]=ar[i+1];
				unique++;
			}
		}
		for(int i=0;i<unique;i++)
			System.out.println(ar[i]+" ");
	}

	private void learning_21() {
		// TODO Auto-generated method stub
		int [] ar= {10,30,90,60,70,40,50,};
		for(int j=1;j<=ar.length;j++) {
		for(int i=0;i<ar.length-j;i++) {
			if(ar[i]>ar[i+1]) {
				int tem=ar[i];
				ar[i]=ar[i+1];
				ar[i+1]=tem;
			}
		}
		System.out.print(ar[ar.length-j] +" ");
		}
	//	System.out.print(ar[ar.length-2] +" ");
	}
	

	private void learning_20() {
		// TODO Auto-generated method stub
		int[]a= {5,10,8,12};
		for(int i=0;i<a.length-1;i++) {
		int small=a[i]<a[i+1]?a[i]:a[i+1];
		int big=a[i]>a[i+1]?a[i]:a[i+1];
	//	int no1=small;
		//int no2=big;
	for(int val=small+1;val<=big;val++) {	
		System.out.print(val+" ");
		
	}
	System.out.println();
		}	
		
	}

	private void learning_19() {
		// TODO Auto-generated method stub
		int[]a= {5,10,15,20};
		for(int i=0;i<a.length-1;i++) {
		int no1=a[i];
		int no2=a[i+1];
	for(int val=no1+1;val<no2;val++) {	
		System.out.print(val);
		
	}
	System.out.println();
		}
		}
	private void learning_18() {
		// TODO Auto-generated method stub
		int[]a= {5,10,15};
		int[]b= {20,25,30};
		int[]result =new int[a.length+b.length];
		int j=0;
		for(int i=0;i<result.length;i++) {
			if(i<a.length) 
			result[i]=a[i];
			else {
				result[i]=b[j];
			j++;
			}
			System.out.println(result[i]);
		}
		
	}

	private void learning_17() {
		// TODO Auto-generated method stub
		int [] a= {5,10,15,20};
		int[] b= {15,10,5};
		int big_len=a.length>b.length?a.length:b.length;
		int small_len=a.length<b.length?a.length:b.length;
		int [] c=new int[big_len];
		for(int i=0;i<big_len;i++) {
		if(i<small_len) {
		c[i]=a[i]+b[i];
		}
		else
			c[i]=a[i];
		System.out.println(c[i]);
		}
		
	}

	private void learning_16() {
		// TODO Auto-generated method stub
		int []a= {5,10,15};
		int []b= {15,10,5};
		int [] c= new int[a.length];
		for(int i=0;i<c.length;i++) {
	   c[i]=(a[i]+b[i]);
	   System.out.println(c[i]);
		
	}
	}
	private void learning_15() {
		// TODO Auto-generated method stub
		String s="prakkkashhhhq";
		char [] name=s.toCharArray();
	//	int big=0; char c ='-';
		for(int j=0;j<name.length;j++) {
			char ch=name[j]; int count=1;	
			if(name[j]=='*')
				continue;
		for(int i=j+1;i<name.length;i++) {
			if(ch==name[i]) {
		name[i]='*';
		count++;
		}
	}
	 // if(count>big) {
	//		big=count;
	//	c=ch;
	//	}
		System.out.println(ch);
		System.out.println(count);}
		}
		//System.out.println(c);
	//	System.out.println( big);
		
	
	private void learning_14() {
		// TODO Auto-generated method stub
		int[] scores= {10,93,100,26,60,5,95};
		int h=0,second_high=0,t_h=0;
	//	int l=190, sl=190;
		for(int i=0;i<scores.length;i++) {
			if(scores[i]>h) {
			second_high=h;
			h=scores[i];}
			else if(scores[i]>second_high) {
				t_h=second_high;
				second_high=scores[i];
			}
			else if(scores[i]>t_h) {
			t_h=scores[i];	
			}
		//	if(scores[i]<l) {
			//	sl=l;
				//l=scores[i];}
				//else if(scores[i]<sl) {
					//sl=scores[i];
			//	}
			
		}
		System.out.println("high:"+ h);
		System.out.println("second high:"+ second_high);
		System.out.println("lowest:"+ t_h);
		//System.out.println("second lowest:" + sl);
	}	
	
	private void learning_13() {
		// TODO Auto-generated method stu
		String s="prakash";
char []name= s.toCharArray();
		
		for(int j=0;j<name.length;j++) {
			char ch=name[j]; int count=1;
			if(ch=='*')
				continue;
			for(int i=j+1;i<name.length;i++) {
				if(ch==name[i]) { 
					//System.out.println("first repeat:" + ch);
		name[i]='*';
			count++;
		           	}
			}
			System.out.println("count of "+ch+" is " + count) ;
			
		}
		
		
	}

	private void learning_12() {
		// TODO Auto-generated method stub
char []name= {'p','r','a','k','a','s','h'};
		
		for(int j=0;j<name.length;j++) {
			char ch=name[j]; boolean rep=false;
			if(ch=='*')
				continue;
			for(int i=j+1;i<name.length;i++) {
				if(ch==name[i]) { 
					//System.out.println("first repeat:" + ch);
		name[i]='*';
			rep=true;
		           	}
			}
		if(rep==false) {
			System.out.println("first non repeated cgar:" + ch);
			}
			}
		}
		
	

	private void learning_11() {
		// TODO Auto-generated method stub
		int count=0;
		int [] marks= {73,83,98,98,93};
		for(int i=0;i< marks.length;i++) {
			System.out.println(marks[i]);
			count=count+marks[i];
		}
		System.out.println(count);
		System.out.println(count/marks.length);
	}

	private void learning_10() {
		// TODO Auto-generated method stub
		char []name= {'a','k','m','n','d'};
		
		for(int j=0;j<name.length;j++) {
			char ch=name[j]; boolean rep=false;
			if(name[j]=='*')
				continue;
			for(int i=j+1;i<name.length;i++) {
				if(ch==name[i]) {
					//System.out.println("first repeat:" + ch);
					name[i]='*';
			rep=true;
		           	
			}
			}
			if(rep==false) {
			System.out.println("first non repeated cgar:" + ch);
		//break;
			}
			
			}
		
	}

	private void learning_9() {
		// TODO Auto-generated method stub
		char []name= {'a','l','r','a','j',};
		for(int j=0;j<name.length-1;j++) {
		boolean rep=false;
		char ch=name[j];
		for(int i=j+1;i<name.length;i++) {
			if(ch==name[i]) {
				rep=true;
				//System.out.println(ch);
				break;
			}
		}
		if(rep==false) {
			System.out.println("first non repeated :"+ ch);
		break;
		}
		
		}
		
	}

	private void learning_8() {
		// TODO Auto-generated method stub
		boolean rep=false;
		char []name= {'s','n','e','k','a',};
		for(int j=0;j<name.length-1;j++) {
	char ch=name[j];
	for(int i=j+1;i<name.length;i++) {
		if(ch==name[i]) { 
			System.out.println("first repeat:" + ch);
	rep=true;
	j=name.length;
           	}
	
	}
	//if(rep==true)
		//break;
	}
	if(rep==false)	
		System.out.println("No repeated word");
	}
	private void learning_7() {
		// TODO Auto-generated method stub
		char []name= {'a','n','a','d','h'};
		char ch= name[0];
		for(int i=1; i<name.length; i++) {
			if(ch==name[i]) {
				System.out.println("first repeat:" + ch);
			break;
			}
			
		}
	}

	private void learning_6() {
		// TODO Auto-generated method stub
		int[]ar= {-5,-10,-20,30,-40,50};
		int count=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<0 && i%2==0) {
				count++;
			System.out.println(i);
		}
		}
		System.out.println("count:"+count);
	}

	private void learning_5() {
		// TODO Auto-generated method stub
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		int[] scores= {45,93,190,56,60};
		int lowest= Integer.MAX_VALUE,
				s_l=Integer.MAX_VALUE;
		for(int i=0;i<scores.length;i++) {
			if(scores[i]<lowest) {
			s_l=lowest;
			lowest=scores[i];}
			else if(scores[i]<s_l) {
				s_l=scores[i];
			}
		}
		System.out.println("lowest:"+ lowest);
		System.out.println("second lowest:"+ s_l);
		
	}

	private void learning_4() {
		// TODO Auto-generated method stub
		//System.out.println(Integer.MAX_VALUE);
		//System.out.println(Integer.MIN_VALUE);
		int[] scores= {45,93,190,56,60};
		int h=Integer.MIN_VALUE,second_high=Integer.MIN_VALUE;
		for(int i=1;i<scores.length;i++) {
			if(scores[i]>h) {
			second_high=h;
			h=scores[i];}
			else if(scores[i]>second_high) {
				second_high=scores[i];
			}
		}
		System.out.println("high:"+ h);
		System.out.println("second high:"+ second_high);	
	}

	private void learning_3() {
		// TODO Auto-generated method stub
		int count=0,count1=0;
		int[] marks= {73,83,100,98,100};
		for(int i=0;i<marks.length;i++) {
		if(marks[i]==100) {
			count++;
			System.out.println(i);
	}
		if(marks[i]>96) {
			count1++;
		}
			
		}
		System.out.println(count);
		System.out.println(count1);
		}
	private void learning_2() {
		// TODO Auto-generated method stub
		int[] marks= {73,83,98,98,93};
	 int low=100;
		for(int i=0;i<marks.length;i++) {
		if(marks[i]<low) {
		low=marks[i];
		
	}
		}
		System.out.println(low);
	}
	private void learning_1() {
		// TODO Auto-generated method stub
		int[] marks=new int[5];
		Scanner sc=new Scanner(System.in);
		int total=0;
		for(int i=0;i<marks.length;i++) {
		System.out.println("Enter mark: ");
		marks[i]=sc.nextInt();
		total=total+marks[i];
		//System.out.println(marks[i]);
		}
sc.close();
System.out.println(total);
System.out.println(total/marks.length);
		}
}
	//	marks[0]=83;
		//marks[1]=73;
		//marks[2]=98;
		//marks[3]=98;
		//marks[4]=93;
		
		//System.out.println(marks[0]);
		//System.out.println(marks[1]);
		//System.out.println(marks[2]);
		//System.out.println(marks[3]);
		//System.out.println(marks[4]);
//for(int i=0;i<marks.length;i++) {
			//System.out.println(marks[i]);
		
	



