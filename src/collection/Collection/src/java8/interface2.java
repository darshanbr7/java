package java8;
// in java 1.8 they extends the interface concept they provide the default and  static method
 interface pack{
	 void m1();
	  void m2();
	 default void m3() {
		  System.out.println("implementation accures at the interface level");
	  }
 }
 class pack1 implements pack{
	 public void m1() {
		 System.out.println("implementation in m1");
	 }
	 public void m2() {
		 System.out.println("implementation in m2");
	 }
 }
 class pack2 implements pack{
	 public void m1() {
		 System.out.println("implementation in m1");
	 }
	 public void m2() {
		 System.out.println("implementation in m2");
	 }
 }
 

public class interface2 {

	public static void main(String[] args) {
		pack1 a=new pack1();
	    pack2 b=new pack2();
	    a.m1();
	    a.m2();
	    b.m1();
	    b.m2();
	    a.m3();
	    b.m3();// without giving implementation we can access the implements method

	}

}
