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
 class interface3 implements imp{
	 public void m1() {
		 System.out.println("implementation in m1");
	 }
	 public void m2() {
		 System.out.println("implementation in m2");
	 }
	 public static void m3() {
		 System.out.println("ststic method override in the child level");
	 }
	 public static void main(String[] args) {
		
		 interface3.m3();
		 imp.m3();
	}
 }
 



