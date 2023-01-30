package Map;

import java.util.HashMap;
import java.util.Iterator;

public class Map3 {

	public static void main(String[] args) {
		HashMap h1=new HashMap();
		 h1.put("name1", "darshan");
		 h1.put("id1", 101);
		 h1.put("name2", "muni");
		 h1.put("id2", 102);
		 h1.put("name3", "chirag");
		 h1.put("id3", 103);
		  // iteration
		 // converting Object to Array
		 for(Object ele:h1.entrySet()) {
			 System.out.println(ele);
		 }
		 for(Object ele:h1.values()) {
			 System.out.println(ele);
		 }
		 for( Object ele:h1.keySet()) {
			 System.out.println(ele);
		 }
		  
		 // iterating through iterator
		Iterator a= h1.entrySet().iterator();
		while(a.hasNext()) {
			System.out.println(a.next());
		}
		
		Iterator b= h1.values().iterator();
		while(b.hasNext()) {
			System.out.println(b.next());
		}
	}

}
