// mehod overloding
class text{
	String name;
	public void m1(){
		System.out.println(" method with 0 argument");
	}
	public void m1(int a){
		System.out.println(" method with 1 int argument");
	}
	public void m1(int a, int b){
		System.out.println(" method with 2 int argument");
	}
	public void m1(String a){
		this.name=a;
		System.out.println(" method with 1 string argument");
		System.out.println(a);
	}
	public void m1(String a,String b){
		System.out.println(" method with  2 String argument");
	}
	public static void main(String args[]){
		  text a=new text();
		  a.m1();
		  a.m1(10.00);
		  a.m1(10,20);
		  //a.m1(10,20,30);
		  a.m1("hi");
		  a.m1("hi","hi");
		  
	}
}