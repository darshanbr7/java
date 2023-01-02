//Abstract in method level
 abstract class text1{
	public abstract void m1();
}
 abstract class text2 extends text1{
	
	public  void m1(){
		System.out.println(" class text1");
	}
}
   class text3 extends text2{
	public  void m1(){
		System.out.println(" class text2");
	}
}
class text{
	public static void main(String args[]){
		 
		 text3 t2=new text3();
		 t2.m1();
	}
}

/* what is method abstract
    a method which contain abstract at the time of declaration are called method abstract.
	abstract method only use in abstract class .
	abstract method ends with semicolon(;).
	abstract method can be override in subclass.
	in obstract class object con't be created.
	*/