package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Arrlist {

	public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(10);
	a.add(11);
	a.add(9);
	a.add(3);
	//a.add("darshan");
	System.out.println("Before sorting "+a);
	Collections.sort(a);// sorting the interger in Assending order
	System.out.println("After Sorting "+a);
	System.out.println("in reverse order");
	Collections.reverse(a);// sorting the arraylist in the dessending order
	System.out.println(a);
	/* if we want to sort the array first we must call the Collections 
	Collection is a class
	Collections is a interface
	*/
	
	}

}
