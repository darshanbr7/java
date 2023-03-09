// implementation in before 1.8 
package java8;
interface test{
	abstract void m1();
	abstract void m2();
}
 class test1 implements test{
	 public void m1(){
		 System.out.println("m1 implementation in test 1");
	 }
	 public void m2(){
		 System.out.println("m2 implementation in test 1");
	 }
}
 class test2 implements test{
	 public void m1(){
		 System.out.println("m1 implementation in test 2");
	 }
	 public void m2(){
		 System.out.println("m2 implementation in test 2");
	 }
}

public class interface1 {

	public static void main(String[] args) {
		test1 t1= new test1();
	    test2 t2= new test2();
	    t1.m1();
	    t1.m2();
	    t2.m1();
	    t2.m2();

	}

}
