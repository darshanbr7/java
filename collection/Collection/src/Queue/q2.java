package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class q2 {

	public static void main(String[] args) {
		 PriorityQueue a=new PriorityQueue();
		 a.add(10);
		 a.add(20);
		 a.add(30);
		 a.add(40);
		 a.add(50);
		 System.out.println(a);
		  Iterator c=a.iterator();
		  System.out.println("iterating through iterator");
		  while(c.hasNext()) {
			  System.out.println(c.next());
		  }
		  System.out.println("iterating through for each loop");
		  for( Object ele:a) {
			  System.out.println(ele);
		  }
		  // convering to array
		 Object b=a.toArray();
		 System.out.println(b);
		 
		 // converting to String'
		 String d=a.toString();
		 System.out.println(d);
		 
		 System.out.println(a.contains(10));
		  
	}

}
