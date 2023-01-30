package Map;

import java.util.HashMap;

public class Map4 {

	public static void main(String[] args) {
		HashMap h1=new HashMap();
		 h1.put("name1", "darshan");
		 h1.put("id1", 101);
		 h1.put("name2", "muni");
		 h1.put("id2", 102);
		 h1.put("name3", "chirag");
		 h1.put("id3", 103);
		 System.out.println(h1);
		 h1.replace("id1", "100");// replace method is used is 
		 System.out.println(h1);
		 h1.remove("id1");//  to remove the element 
		 System.out.println(h1);
		  HashMap h2=new HashMap();
		  h2.putAll(h1);// to add all element to the new Object
		  System.out.println(h2);
		  h1.clear();
		  System.out.println(h1);
		  

	}

}
