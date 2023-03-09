abstract class text{
	abstract void m1();
}
class pen extends text{
	void m1(){
		System.out.println(" perfect");
	}
	public static void main(String args[]){
		 pen a=new pen();
		 a.m1();
	}
}