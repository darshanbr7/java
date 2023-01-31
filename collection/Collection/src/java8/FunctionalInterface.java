package java8;
//@functinalInterface
// a interface which contain only one abstract method is called functional implementation

@interface Function{
		void m1();
		void m2();
		
	
	}

public class FunctionalInterface implements Function {
  public void m1() {
	  System.out.println("functional implementation");
  }
  public void m2() {
	  System.out.println("functional implementation");
  }
  public void m1(String msg) {
	  System.out.println("functional implementation accures at "+msg);
  }
  public static void main(String[] args) {
	 FunctionalInterface a=new FunctionalInterface();
	 a.m1();
	 a.m1("hello java");
}
}
