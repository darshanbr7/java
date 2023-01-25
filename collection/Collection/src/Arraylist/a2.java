package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class a2 {

	public static void main(String[] args) {
		// some method to Array List
		ArrayList a=new ArrayList();
		
		// adding a element
		a.add(1);
		a.add(1);
		a.add("darshan");
		a.add("mandya");
		System.out.println(a);
		
		// updating the values
		a.set(2,3);
		a.set(3, 4);
		
		// sorting the ArrayList
		Collections.sort(a);
		System.out.println(a);
		
		// reverse ordering the Arraylist
		Collections.reverse(a);
		System.out.println(a);
		
		// get method 
		System.out.println(a.get(2));
		
	    // remove method
		a.remove(2);
		System.out.println(a);
		
		// AddAll method
		ArrayList c=new ArrayList();
		c.addAll(a);
		System.out.println(c);
		
		// size method
		System.out.println(a.size());
		
		// clear method
		a.clear();
		System.out.println(a);
		
		// removeAll method
		c.removeAll(c);
		System.out.println(c);
		

	}

}
