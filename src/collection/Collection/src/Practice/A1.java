package Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class A1 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(11);
		a.add(12);
		ArrayList b=new ArrayList();
		a.add(10);
		a.add(11);
		a.add(12);
		System.out.println(a);
		/*System.out.println(a.contains(10));
		System.out.println(a.equals(b));
		System.out.println(Objects.equals(a, b));
		System.out.println(Objects.equals(a, b));
		*/
		
		Iterator c=a.iterator();
	   while(c.hasNext()) {
		System.out.println(c.next());
	    }
	  System.out.println(a);
	  a.remove(3);
	  a.remove(4);
	  //a.remove(5);
	  a.remove(2);
	  System.out.println(a);

	}

}
