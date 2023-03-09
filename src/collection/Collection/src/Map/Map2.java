package Map;

import java.util.HashMap;

public class Map2 {

	public static void main(String[] args) {
		// creation of HashMap
		 HashMap h1=new HashMap();
		 h1.put("name1", "darshan");
		 h1.put("id1", 101);
		 h1.put("name2", "muni");
		 h1.put("id2", 102);
		 h1.put("name3", "chirag");
		 h1.put("id3", 103);
		 //System.out.println(h1);
		 // some reading method of Hashmap
		 
		 System.out.println(h1.values());  // returns the value 
		 System.out.println(h1.keySet());// returns only keys
		 System.out.println(h1.containsKey("id1"));// it check the the value prsent or not
		 System.out.println(h1.size());// it returns the size of the HashMap
		 System.out.println(h1.entrySet());// it returns the key value pair
		 System.out.println(h1.containsValue("darshan"));// it heck the value is present or not\
		 System.out.println(h1.get("id1"));// in get method if we pass the argument or parameter to get its value
		 System.out.println(h1.isEmpty());// it check the oject is empty or not
		 System.out.println();
	}

}