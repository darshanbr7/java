package java8;
interface inum1{
	boolean m1(int a);
}
public class task1  {
	 static   inum1 i=(a)->{return a>100;};

	public static void main(String[] args) {
		System.out.println(i.m1(10));
	}

}
