package Com.collection.pkg;

import java.util.LinkedList;

public class MyLinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
      ll.add(3); 
      ll.add(3);
      ll.add("vignesh");
      ll.add("orange");
      ll.add("pink");
      ll.add(0.7);
      
     // ll.remove(0.7);
	System.out.println(ll.size());	
	System.out.println(ll);
	System.out.println(ll.indexOf(7));
	System.out.println(ll.get(1));
//	System.out.println(ll);
	// it is stored double linked list ds
	// ll.add("maha");it is add last of list
	// ll.add(1,"raja"); replace index 1,
	//  ll.set(0,"raj");	set the value,remove older value
	//  ll.contains("orange"); true or false
	}
}
