package MethodOverriding;

public class m2 extends m1{
	public void m2() {
		System.out.println("method in child class");
	}

	public static void main(String[] args) {
		m2 b=new m2();
		b.m2();
	}

}
