package LList;

import java.util.Iterator;
import java.util.LinkedList;

public class L1 {

	public static void main(String[] args) {
	// creation of Linked List
		LinkedList a=new LinkedList();
		
		// adding element to the Linked List
		a.add(10);
		a.add(11);
		a.add(12);
		a.add(13);
		
		// reading the Linked List
		System.out.println(a);
		
		// iterating  using for loop
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		// iterating using While loop
		int i=0;
		while(i<a.size()) {
			System.out.println(a.get(i));
			i++;
		}
		
		// iterating using Iterator
		 Iterator b=a.iterator();
		 while(b.hasNext()) {
			 System.out.println(b.next());
		 }
		 
		 // adding firt to the Linked List
		 a.addFirst(9);
		 System.out.println(a);
		 
		 // adding last to  LinkedList
		 a.addLast(15);
		 System.out.println(a);
		 
		 // adding string at last in LinkedList
		 a.addLast("darshan");
		 System.out.println(a);
		 
		 // null insertioin
		 a.add(null);
		 System.out.println(a);
		 
		 a.add(null);
		 System.out.println(a);
		 
		   LinkedList c=new LinkedList();
		   
		   // add all method
		   c.addAll(a);
		   System.out.println(c);
		   
		   //remove method 
		   c.remove(2);
		   System.out.println(c);
		   
		   // size method()
		   System.out.println(a.size());
		   
		   // set method 
		   a.set(2, "mandya");
		   System.out.println(a);
		   
		   // get method
		   System.out.println(a.get(4));
		   
		   // clear method
		   c.clear();
		   System.out.println(c);
		   
		   // for removing first element
		   a.removeFirst();
		   System.out.println(a);
		   
		   // for removing last element
		   a.removeLast();
		   System.out.println(a);
		  
		   // addAll method
		   c.addAll(a);
		   System.out.println(c);
		   
		   // removeAll method
		   c.removeAll(c);
		   System.out.println(c);
		 
	}

}
