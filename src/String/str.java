//  String 
  // string is a sequence of character;
  class text{
	  public static void main(String args[]){
		 // creation of string using two ways
		 
		 // using String literals
		 String a="java String";
		 
		 // Using new keyword
		  String b=new String("darshan");
		 System.out.println(a);
		 System.out.println(b);
		 
		 
	  }
  }
  /*if we create the object using String literls  the object is created in the "String Constant pool"(Scp) area
  if we create the string using new keyword it stores in the string constant pool  an the same object is also created
  in  same object the Heap area  ."
    the object created in String constatnt pool are destroyed when the JVM is shout down.   
	 it is introduced in the version of 1.0
	 
	 strings are immutable object;
	*/