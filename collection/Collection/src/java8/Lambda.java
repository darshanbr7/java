package java8;
@FunctionalInterface
interface inter1{
	void m1();
	
}
public class Lambda {
	
	public static void main(String[] args) {
	  inter1 a=()->{System.out.println("lambda expresion");};
	  a.m1();
	  /* we can use achive the functional interface using lambda expression
	   benifits of Lambda
	   * it consis the code
	   * it not needed the Acess modifier
	   * it not needed method name
	   * it not needed return keyword also
	   */

	}

}
