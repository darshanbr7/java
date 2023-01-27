package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class a6 {

	public static void main(String[] args) {
		int[] a= {10,11,12,13,14,15};
		System.out.println(a);
	   ArrayList b=new ArrayList();
		 //b=Arrays.asList(a);
		 System.out.println(b);
		 // converting array to Arraylist    through foreach method
		 for(int ele:a) {
			 b.add(ele);
		 }
		 System.out.println(b);
		ArrayList c= new ArrayList();
		Collections.addAll(c, a);
		System.out.println(c);
	}

}
