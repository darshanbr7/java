package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class a1 {

	public static void main(String[] args) {
		// creation of Array List
		 ArrayList a=new ArrayList();
		 // addding a element to ArrayList
		 a.add(10);
		 a.add("darshan");
		 a.add("Mandya");
		 a.add(21);
		 System.out.println(a);
		 
		 // Reading  the ArrayList elemen Using Iterator
		  Iterator b=a.iterator();
		  while(b.hasNext()) {
			  System.out.println(b.next());
		  }
		 // updating the values
		  a.set(2, "bolare");
		  System.out.println(a);
		  // removing the arraylist element
		  a.remove(2);
		  System.out.println(a);

	}

}
