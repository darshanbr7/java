package java8;
// in java 1.8 they extends the interface concept they provide the default and  static method
 interface imp{
	 void m1();
	  void m2();
	 static void m3() {
		 System.out.println("implementation using the static method");
	 }
 }
 class imp1 implements imp{
	 public void m1() {
		 System.out.println("implementation in m1");
	 }
	 public void m2() {
		 System.out.println("implementation in m2");
	 }
 }
 class imp2 implements imp{
	 public void m1() {
		 System.out.println("implementation in m1");
	 }
	 public void m2() {
		 System.out.println("implementation in m2");
	 }
 }
 

public class interface3 {

	public static void main(String[] args) {
	   imp1 a=new imp1();
	   imp1.m3();

	}

}

