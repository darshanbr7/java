class parent{
	public static void m1(){
		System.out.println("m1 method");
	}
	public static void m2(){
		System.out.println("m2 method");
	}
	static int a=10;
}
class child extends parent {
	public void m3(){
		System.out.println("m3 method");
	}
	public static void main(String args[]){
 	
	parent a=new parent();
	a.m1();
	a.m2();
	//a.m3();
	
	
  child b=new child();
  b.m1();
  b.m2();
  b.m3();
  System.out.println(a);
  System.out.println(parent.a);
  System.out.println(child.a);
  System.out.println(b.a);
  
     parent c= new child();
	 c.m1();
	 c.m2();
	 //c.m3();
	 
 child d= new parent();
	 
  
	
	}
	
}