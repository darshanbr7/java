package Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class h1 {

	public static void main(String[] args) {
    //creation of the Hash Set
		 HashSet h1=new HashSet();
		 // adding element to the HashSet
		 h1.add(10);
		 h1.add("darshan");
		 h1.add(21);
		 System.out.println(h1);
		 // indexing conept is not applicable
		 
		 // iteration of Hashset
		 // indexing concept is not there in hashset thats why normal iteration is not possible like( for ,while,do while)
		 // iterating using For-each method
		  for( Object obj:h1) {
			  System.out.println(obj);
		  }
		  
		  // iterating using iterator
		  Iterator a= h1.iterator();
		  while(a.hasNext()) {
			  System.out.println(a.next());
		  }
		  
		  // updating the value
		  for( Object obj:h1) {
			  if(obj.equals("darshan")) {
				  h1.remove(obj);
				  h1.add("raju");
				  break;
			  }
		  }
		  System.out.println(h1);
		   for(Object obj:h1) {
			   if(obj.equals(21)) {
				   h1.remove(obj);
				   h1.add("mandya");
				   break;
			   }
		   }
		   System.out.println(h1);
		   
		   // removing the element in hashset
		   h1.remove(10);
		   System.out.println(h1);
		  
	}

}
