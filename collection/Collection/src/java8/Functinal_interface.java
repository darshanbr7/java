package java8;
@FunctionalInterface
interface inum{
	int  m1(int a);
}
public class Functinal_interface  {
	//static inum i=(a)->{return a*a;};
	 static inum i=a->a*a; 

	public static void main(String[] args) {
		System.out.println(i.m1(10));
 
	}

	

}
