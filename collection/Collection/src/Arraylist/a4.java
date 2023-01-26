package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class a4 {

	public static void main(String[] args) {
	    ArrayList a=new ArrayList();
	    a.add(10);
	    a.add(11);
	    a.add(12);
	    a.add(13);
	    System.out.println(a);
	    
	    //to convertin to Array
	    Object b=a.toArray();
	    System.out.println(b);
	    
	    a.trimToSize();
	    System.out.println(a);
	    
	    a.add(14);
	    System.out.println(a);
	    
	    Collections.replaceAll(a,12,40);
	    System.out.println(a);
	    
	    ArrayList c=(ArrayList)a.clone();
	    System.out.println(c);
	    
	    // retinAll method
	    a.remove(1);
	    a.remove(2);
	    a.retainAll(c);
	    System.out.println(a);

	}

}
