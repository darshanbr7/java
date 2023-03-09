package Queue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class q3 {

	public static void main(String[] args) {
				 PriorityQueue a=new PriorityQueue();
				 a.add(10);
				 a.add(10);
				 a.add(20);
				 a.add(30);
				 a.add(40);
				 a.add(50);
				 System.out.println("Priority Queue"+ a);
			 ArrayList b= new ArrayList(a);
			 System.out.println("ArrayList as a:"+b);
			 
			  LinkedList c=new LinkedList(a);
			  System.out.println("Lisnked list :"+c);
			  
			   HashSet d=new HashSet(a);
			   System.out.println("Hash set as a:"+d);
			   
			   Object e =a.toArray();
			   System.out.println("As a Array: "+e);
	}

}
