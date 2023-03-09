package MethodOverloding;

public class m1 {
public static void m1 (int a){
	System.out.println("Accept only one argument- integer");
}
public static void m1(String a) {
	System.out.println("Accept only single String argument");
}
public static void main(String[] args) {
	 m1 a=new m1();
	 a.m1(10);
	 a.m1("darshan");
}
}
