package MethodOverriding;

public class m1 {
	public void m2() {
		System.out.println("first method");
	}
    public void m2() {
    	System.out.println("Second method");
    }
	public static void main(String[] args) {
		m1 a=new m1();
		a.m2();
	}

}
