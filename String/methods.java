class text{
	public static void main(String args[]){
		 String a=new String("darshan  ");
		 String b=new String ("Darshan");
		 
		 System.out.println(a.charAt(4));
		 // charAt()  --Returns the character at the specified index (position)
		
		System.out.println(a.compareTo(b));
		 // compareTo() -- Compares two strings lexicographically
		
		System.out.println(a.concat("B R"));
		 //concat() -- Appends a string to the end of another string
	
	System.out.println(a.contains("a"));
		 // contains()  --	Checks whether a string contains a sequence of characters
		
		System.out.println(a.endsWith("n"));
		 //endsWith()	-- Checks whether a string ends with the specified character(s)
		
		System.out.println(a.equals(b));
		 //equals()  --	Compares two strings. Returns true if the strings are equal, and false if not
		
		System.out.println(a.indexOf("s"));
		 // indexOf() -- Returns the position of the first found occurrence of specified characters in a string
		
		System.out.println(a.isEmpty());
		 // isEmpty() --	Checks whether a string is empty or not
		
		System.out.println(a.lastIndexOf("n"));
		 //lastIndexOf() -- Returns the position of the last found occurrence of specified characters in a string
		
		System.out.println(a.length());
		 //length() --	Returns the length of a specified string
		
		System.out.println("welcone to java".matches("java"));
		 //matches() --	Searches a string for a match against a regular expression, and returns the matches
		
		System.out.println(a.replace("d","D"));
		 //replace()--Searches a string for a specified value, and returns a new string where the specified values are replaced
		
		System.out.println("darshan".split("darshan"));
		 System.out.println(a.startsWith("D"));
		 //startsWith()	-- Checks whether a string starts with specified characters
		
		System.out.println(a.substring(2,4));
		 // substring() --	Returns a new string which is the substring of a specified string
		
		System.out.println(a.toCharArray());
		 // toCharArray()	Converts this string to a new character array
		
		System.out.println(a.split(a,1));
		 //split()	Splits a string into an array of substrings
	
    	System.out.println(a.toLowerCase());
		 // toLowerCase()	Converts a string to lower case letters
	
    	System.out.println(a.toUpperCase());
		 //toUpperCase()	Converts a string to upper case letters
		
		System.out.println(a.toString());
		 //toString()	Returns the value of a String object
		 
		 System.out.println(a.trim());
		 //trim()	Removes whitespace from both ends of a string
		
		System.out.println(a.valueOf("dars"));
		 //valueOf()	Returns the string representation of the specified value
	}
	
}