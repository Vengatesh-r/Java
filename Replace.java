package Array;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Replace arr=new Replace();
		//arr.a1();
		//arr.a2();
		//arr.a3();
      // arr.a4();
      arr.a5();
      // arr.a6();
      // arr.a7();
       //arr.a8();
		}

	private void a8() {
		// TODO Auto-generated method stub
		int x[]= {1,2,5,4,7,6,8};
		for(int i=0;i<=x.length-1;i++) {
			if(i%2 !=0 && x[i]%2==0) {
		System.out.println(x[i]);
	}
		}
	}
	private void a7() {
		// TODO Auto-generated method stub
		int x[]= {1,2,5,4,7,6,8};
		for(int i=0;i<=x.length-1;i++) {
		if(i%2==0 && x[i]%2 !=0) {
			System.out.println(x[i]);
		}
	}
	}
	private void a6() {
		// TODO Auto-generated method stub
		int x[]= {7,1,11,9,0,2,6,4,3,5,1,9,7};
		int sum=0,count=0;
		for(int i=0;i<=x.length-1;i++){
		sum=sum+x[i];
		count++;
	}
		System.out.println("Sum:"+ sum);
		System.out.println("count:"+ count);
		System.out.println("avg:"+ sum/count);
	}
	private void a5() {
		// TODO Auto-generated method stub
		String s="Java"; 
		char search='a';
		char c[]=new char[s.length()];
		for(int i=0;i<c.length-1;i++) {
			c[i]=s.charAt(i);
			if(c[i]==search) {
				System.out.println(i);
				break;
			}
			}
	}

	private void a4() {
		// TODO Auto-generated method stub
		String s="Mississippi is a river";
		 char search='i',replace='!'; int count=0;
    char C []=new char[s.length()];
		for(int i=C.length-1; i>=0;i--) {
		C[i]=s.charAt(i);
		if(C[i]==search) {
			count++;
		if(count==1)	
		C[i]=replace;
		}
		}
		System.out.print(C);
	}

	private void a3() {
		// TODO Auto-generated method stub
		String s="Mississippi is a river";
	    char search='i',replace='!'; int count=0;
	       char C []=new char[s.length()];
			for(int i=0; i< C.length;i++) {
			C[i]=s.charAt(i);
			if(C[i]==search && count<1) {
				C[i]=replace;
			    count++;
			//if(count==1) 
				}	
			System.out.println(C[i]);
			}
			
			}
			
			
	
	private void a2() {
		// TODO Auto-generated method stub
		String s="Mississippi is a river";
	    char search='i',replace='!';
	       char C []=new char[s.length()];
			for(int i=0; i< C.length;i++) {
			C[i]=s.charAt(i);
			if(C[i]==search) {
		C[i]=replace;
			}
			System.out.print(C[i]);
			}
			//System.out.println();
			
			//System.out.print(C[i]);	
	}

	private void a1() {
		// TODO Auto-generated method stub
		String s="Mississippi is a river";
	    int count=0; char search='i';
	       char C []=new char[s.length()];
			for(int i=0; i< C.length;i++) {
			C[i]=s.charAt(i);
		if(C[i]==search) {
				count=count+1;
			}
			}
			System.out.println(count);
		
	}

}
