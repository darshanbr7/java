class text{
	void m1(){
		System.out.println("zero argument");
	}
	void m1(int a){
		System.out.println("int argument");
	}
	/*void m1(double a){
		System.out.println("float argument");
	}*/
	void m1(char a){
		System.out.println("char argument");
	}
	void m1(String a){
		System.out.println("string argument");
	}
	public static void main(String args[]){
	text a=	new text();
	  a.m1();
	  a.m1(10.00);
	}
}


/* float value converted into to double
  but double value con't convert into float or int. 
  
  the argument are given in the format of Double Quotes are taks as a String
  even Single character gives with the double quotes.
   Ex:a.m1("c");  // string
   
   not undergoes  type conversion to the char to string.
   Ex:a.m1('hello');  // compile Error.
   
   float can not converted into  int
   
   in jvm it undergoes lower to higher but not degrades higher to lower 
  */