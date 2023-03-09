package Queue;

import java.util.Comparator;

import java.util.PriorityQueue;
import java.util.iterator;

public class q1 {

	public static void main(String[] args) {
		 PriorityQueue a=new PriorityQueue();
		 a.add(10);
		 a.add(10);
		 a.add(29);
		 a.add(31);
		 a.add(1);
		 a.add(2);
		// a.add("darshan");
		 System.out.println(a);
		a.poll();
		System.out.println(a);
		System.out.println(a.poll());
		// poll menthod is remove the head of the element- if there is no element in head
		// it shows the null
		System.out.println(a);
		System.out.println("peak method :"+a.peek());
		/* in peek method is shows the head of the element - not remove the element 
		  if there is no element it shows the null */
		 System.out.println(a);
		 // offer method is used to add the element to the
		 a.offer(10);
		 a.offer(11);

		 System.out.println(a);
		 // element 
		 System.out.println("head element by 'element method': "+a.element());
		 System.out.println(a);
		 PriorityQueue b=new PriorityQueue();
		 System.out.println(b);
		 //System.out.println(b.element());
		 System.out.println(b.size());
		 System.out.println(a.contains(10));
		 System.out.println(a.isEmpty());
		 b.addAll(a);
		 System.out.println(" b priority queue :"+b);
		 a.clear();
		 System.out.println("Queue after clear method:"+a);
		 System.out.println(b);
		 System.out.println(b.remove(10));
		 System.out.println(" b after remove method :"+b);
		  Iterator c=b.iterator();
		 while(c.hasNext()) {
			 System.out.println(a.next());
		 }
		 
		 

	}

}
