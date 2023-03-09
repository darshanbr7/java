package java8;
@FunctionalInterface
interface inter2{
	int m1(int a, int b);
}

public class Lambda1 {
	public static void main(String[] args) {
		inter2 c=(a,b)-> {return a*b;};
		c.m1(10, 20);
	}

}
