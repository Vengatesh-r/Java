package Com.pkg.String;

public class MystringMethod {
	public static void main(String[] args) {
		 MystringMethod sm=new  MystringMethod();
	//	sm.stringmethod1();//uppercase to lowercase(+32),lowercase to uppercase(-32)
	//	sm.stringmethod2();
	//	sm.stringmethod3();
	//	sm.stringmethod4();
	//	sm.stringmethod5();//stripleading
	//	sm.stringmethod6();//strip leading
	//	sm.stringmethod7();//strip trailing
	//	sm.stringmethod8();//trim
//		sm.stringmethod9();
	//	sm.stringmethod10();
	//	sm.stringmethod11();//decimal to binary
		sm.stringmethod12();
	}
	

	private void stringmethod12() {
		// TODO Auto-generated method stub
		String s ="A5B5C5D5F5";
		for(int i=0;i<s.length()-1;i+=2) {
		char letter =s.charAt(i);
		char num=s.charAt(i+1);
		for(char ch='1';ch<=num;ch++) {
		System.out.println(letter);
		}
		}
	}


	private void stringmethod11() {
		// TODO Auto-generated method stub
	int no=4;
	String total="";
		while(no>=1) {	
			int rem=no%2;
			total=total+rem;//total=rem+total
			no=no/2;
		}
	System.out.println(total);	
		
	}


	private void stringmethod10() {
		// TODO Auto-generated method stub
		String s="how    are   you";
		for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!=' ')
		System.out.println(s.charAt(i));
		else {
			System.out.println(s.charAt(i));
			for(int j=i;j<s.length();j++) {
			if(s.charAt(j)==' ')
			continue;
			else {
				i=j-1;
				break;
			}
		}
	}
		}	
	}
	private void stringmethod9() {
		// TODO Auto-generated method stub
		String s1="Today is Thurs day";
		String s2="day";
		for(int i=0;i<s1.length();i++) {
		if(s2.charAt(0)==s1.charAt(i))
		{
			int count=0;
			for(int j=0;j<s2.length();j++) {
				{
				if(s2.charAt(j)==s1.charAt(i))	{
					count++;
					i++;
				}
				}
			}	
		if(count==s2.length())	{
		System.out.println("yes contains");	
		break;
			
		}
		else {	
			System.out.println("not contains");
			break;
		}
		}
	}
	}

	private void stringmethod8() {
		// TODO Auto-generated method stub
		String s = "        How Are you        ";
	    int start = 0, end = s.length()-1; 
	    boolean first = false, last = false; 
	    for(int i=0; i<s.length();i++)
	    {
	      if(s.charAt(i)==' ' && first == false)
	      {
	        start++;
	      }
	      else
	      {
	        first = true; 
	      //  start = i; 
	      }
	      if(s.charAt(end)==' ' && last == false)
	      {
	        end--; 
	      }
	      else {
	        last = true; 
	        //end  = i; 
	      }
	      if(first==true && last == true)
	      {
	        for(int j=start; j<=end;j++)
	          System.out.print(s.charAt(j));
	        break; 
	      }
	    }
	}

	private void stringmethod7() {
		// TODO Auto-generated method stub
		String s= "how are you    ";
		int last =s.length()-1;
		for(int i=s.length()-1;i<0; i--) {
		if(s.charAt(i)!=' ')
		{
		last=i;
		break;
		}
	}
for(int i=0;i<last;i++) {
	
	System.out.print(s.charAt(i));
	
}
	
}

	private void stringmethod6() {
		// TODO Auto-generated method stub
		String s="   how ara you";
		boolean first=false;
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)==' '&& first==false) 
			{
 		}
			else
			{
				first=true;
		System.out.print(s.charAt(i));
			}
		}
	}


	private int length() {
		// TODO Auto-generated method stub
		return 0;
	}


	private void stringmethod5() {
		// TODO Auto-generated method stub
		String s="pechi muthu selvam";
		for(int i=0;i<s.length();i++) {
			char ch =s.charAt(i);
			if(i==0 ||i==s.length()-1) {
				if(ch>='a'&& ch<='z')	
					System.out.println((char)(ch-32));}	
			else if(ch==' ') {
			System.out.println(ch);
			i++;
			ch=s.charAt(i);
			if(ch>='a'&& ch<='z')	
			System.out.println((char)(ch-32));
			}
			else
			{
				int j=i+1;
				if(j<s.length()&& s.charAt(j)==' ') {
					if(ch>='a'&& ch<='z')	
				System.out.println((char)(ch-32));}	
				else
					System.out.println(ch);
			}
			
		}
	}


	private void stringmethod4() {
		// TODO Auto-generated method stub
	String s="pechi muthu selvam";
	for(int i=0;i<s.length();i++) {
		char ch =s.charAt(i);
		if(i==0) {
			if(ch>='a'&& ch<='z')	
				System.out.println((char)(ch-32));}	
		else if(ch==' ') {
		System.out.println(ch);
		i++;
		ch=s.charAt(i);
		System.out.println((char)(ch-32));
		}
		else
			System.out.println(ch);
		
	}
	}
	
	private void stringmethod3() {
		// TODO Auto-generated method stub
		String s="prakash";
		for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(i==0||i==s.length()-1||i==(s.length()/2) )	
		System.out.println((char)(ch-32));
		
		else
			System.out.println(ch);		
	}
		
	}


	private void stringmethod2() {
		// TODO Auto-generated method stub
		String s="prakash1234";
		for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(i%2==0) {
		if(ch>='a'&& ch<='z')	
		System.out.println((char)(ch-32));
		}
		else
			System.out.println(ch);		
	}
	}

	private void stringmethod1() {
		// TODO Auto-generated method stub
		String s="abcd1234";
		for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch>='a'&& ch<='z')
		System.out.println((char)(ch-32));
		else
			System.out.println(ch);		
	}
}
}