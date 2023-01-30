package LHashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class LH2 {

	public static void main(String[] args) {
		 LinkedHashSet a=new LinkedHashSet();
		 a.add(8);
		 a.add(7);
		 a.add(6);
		 a.add(5);
		 System.out.println(a);
		 ArrayList b=new ArrayList(a);
		 System.out.println(b);
		Collections.sort(b);
		System.out.println(b);
	}

}
