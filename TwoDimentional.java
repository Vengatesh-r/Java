package com.pkg.twoDimentionalArray;

import java.util.Scanner;

public class TwoDimentional {

	public static void main(String[] args) {
		TwoDimentional td=new TwoDimentional();
	//	td.td1();
	//	td.td2();
	//	td.td3();
//		td.td4();//matrix addition
	//	td.td5();//total of two arrays
	//	td.td6();
	//	td.td7();//split array
		//td.td8();//spiral matrix
       td.td9();
	}
	private void td9() {
		// TODO Auto-generated method stub
		int[][]a=new int[5][5];
		  for(int i=0;i<5; i++)
		  {
		    for(int j=0; j<5; j++)
		    {
		  //    System.out.print(a[i][j]+"  ");
		    }
		    System.out.println();
		  }
		  int no = 1; 
		  int minRow=0, minCol=0, maxCol=4, maxRow=4; 
		  while(no<=25) {
		  for(int col=maxCol; col>=minCol; col--)
		  {
		    a[minRow][col] = no; no++; 
		  }
		  minRow++;
		  for(int row=minRow; row<=maxRow;row++)
		  {
		    a[row][minCol] = no; 
		    no++; 
		  
		  //System.out.println( a[row][minCol] );
		  }
		  minCol++;
		  for(int col=minCol; col<=maxCol;col++)
		  {
		    a[maxRow][col] = no; no++; 
		    System.out.println(  a[maxRow][col]);
		  }
		  maxRow--;
		  for(int row=maxRow; row>=minRow;row--)
		  {
		    a[row][maxCol] = no; no++; 
		  }
		  maxCol--;
		  }  
		  for(int i=0;i<5; i++)
		  {
		    for(int j=0; j<5; j++)
		    {
		      System.out.print(a[i][j]+"\t");
		    }
		    System.out.println("\n");
		  } 
	}
	private void td8() {
		// TODO Auto-generated method stub
		  int[][] a = new int[4][4];
		  for(int i=0;i<4; i++)
		  {
		    for(int j=0; j<4; j++)
		    {
		      System.out.print(a[i][j]+"  ");
		    }
		    System.out.println();
		  }
		  
		  int no = 1; 
		  int minRow=0, minCol=0, maxCol=3, maxRow=3; 
		  while(no<=16)
		  {
		  
		  for(int col=minCol; col<=maxCol; col++)
		  {
		    a[minRow][col] = no; no++; 
		  }
		  minRow++;
		  // 5 6 7 
		  for(int row=minRow; row<=maxRow; row++)
		  {
		    a[row][maxCol] = no; no++; 
		  }
		  maxCol--; 
		  
		  //8 9 10
		  for(int col=maxCol; col>=minCol; col--)
		  {
		    a[maxRow][col] = no; no++; 
		  }
		  maxRow--; 
		  
		  // 11 12
		  for(int row=maxRow;row>=minRow; row--)
		  {
		    a[row][minCol] = no; no++; 
		  }
		  minCol++; 
		  }
		  
		  for(int i=0;i<4; i++)
		  {
		    for(int j=0; j<4; j++)
		    {
		      System.out.print(a[i][j]+"\t");
		    }
		    System.out.println("\n");
		  }
		
		
	}
	private void td7() {
		// TODO Auto-generated method stub
		int[] a= {2,3,4,7,8,9,10,11,12,13,5,14,15,16,17,18,19,20,21,22,23,24,25};

		int [] b= new int[a.length/2];
		int [] c= new int[a.length/2];
		System.out.print(b.length+" ");
		System.out.println(c.length);
		
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(10>a[i]) {
		b[j]=a[i];
	
		System.out.print(b[j]+" ");	
		}
		}
		
System.out.println();
		int k=0;
		for(int i=0;i<a.length;i++) {
			if(10<a[i]) {
		c[k]=a[i];
		System.out.print(c[k]+" ");
		}
		}
	}
	private void td6() {
		// TODO Auto-generated method stub
		int[][]a= {{10,20,30},{40,50,30},{20,30,10}};
		int total=0;
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[row].length;col++) {
				if(row==col)
		total+=a[row][col];
			}
		}
		System.out.println(total);
		
	}
	private void td5() {
		// TODO Auto-generated method stub
		int [][]marks= {{50,60,45,80,90},{60,78,35,76,87}};
		int total=0;
		for(int row=0;row<marks.length;row++) {
			for(int col=0;col<marks[row].length;col++) {
				total=total+marks[row][col];
			}
			System.out.println(total);
		}
	}
	private void td4() {
		// TODO Auto-generated method stub
		int[][]a= {{10,20},{30,40}};
		int [][]b= {{40,30},{20,10}};
		int [][]c=new int[2][2];
		for(int row=0;row<c.length;row++) {
		for(int col=0;col<c[row].length;col++) {
		c[row][col]=a[row][col]+b[row][col];
		System.out.print(c[row][col]+" ");
		}
		System.out.println();
		}
		
	}
	private void td3() {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int [] b= new int[(a.length/2)];
		int [] c= new int[a.length/2];
		int j=0,k=0;
		
		for( int i=0;i<a.length;i++) {
			if(10>a[i]) {
        	b[j]=a[i];
        	j++;
			}
	
        }
		
		for( int i=0;i<a.length;i++) {
			if(10<a[i]) {
        	c[k]=a[i];
        	k++;
        }
		}
		
		for( int i=0;i<b.length;i++) 
		System.out.print(b[i]+" ");
		
		
		System.out.println();
		
		
		for(int i=0;i<c.length;i++) 
		System.out.print(c[i]+" ");	
			}
	private void td2() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int total=0;
		int[][]player=new int[2][];
	//	player[0]=new int[4];
		for(int i=0;i<player.length;i++) {
			System.out.print("Enter match: ");
			player[i]=new int[sc. nextInt()];
			//total=total+player[0][match];
		for(int match=0;match<player[i].length;match++) {
			System.out.println("Enter Scores player"+i+"");
			player[i][match]=sc.nextInt();
			total+=player[i][match];
		}
		System.out.println("Total Score+total");
		System.out.println("percentage"+total/player[i].length);
		}
		}
	/*	System.out.println(total);
		System.out.println(total/player[0].length);
		player[1]=new int[3];
		for(int match=0;match<player[1].length;match++) {
	System.out.print("Enter score: ");
		player[1][match]=sc. nextInt();
		}
	System.out.println(total);
	System.out.println(total/player[1].length);
		}*/
	
	private void td1() {
		// TODO Auto-generated method stub
		int[][] scroes=	{{65,70,84,72},{80,43,55,67}};
		for(int player=0;player<2;player++) {
			for(int match=0;match<4;match++) {
				System.out.print(scroes[player][match]+" ");
			}
			System.out.println();
		}
	}
}


