package Arraylist;

import java.util.ArrayList;

public class a3 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		System.out.println(a);
		// clone method
		 ArrayList b = (ArrayList)a.clone();
	     System.out.println("Cloned ArrayList: " + b);	
	     
	     //indexOf() method  
	     System.out.println(a.indexOf(10));
	     
	     // lastIndexOf()
	     System.out.println(a.lastIndexOf(20));
	     
	     // sublist method
	     System.out.println(a.subList(0, 2));
	     
	     // to string method  --it converts arrayList to String
	     String d=a.toString();
	     System.out.println(d);
	     
	      
	     
	}
	
	
}
