 abstract class text{
	 abstract  static void m1();
}
class a1 extends text{
	static void m1(){
		System.out.println("Abstact method");
	}
	public static void main(String args[]){
		a1 a=new a1();
		a1.m1();
	}
}