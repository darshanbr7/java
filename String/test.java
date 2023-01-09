// testing the mutabality on the String ,StringBuffer, StringBuilder.
 class text{
	 public static void main(String args[]){
		   String a=new String("darshan");
		   a.concat("B R");  // value is not changed  -it is immutable
		   System.out.println(a);
		  StringBuffer b=  new StringBuffer("darshan");
		  b.append("B R");
		   System.out.println(b); // value is mutable  value changed
		   StringBuilder c=  new StringBuilder("darshan");
		  c.append("B R");
		   System.out.println(c);// value is mutable  value changed
		   
	 }
 }