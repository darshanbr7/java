// object creation using instance variable
class text{
	int a=10;
	static int b=20;
	public static void main(String args[]){
		text a1=new text();
		 text b1= new text();
		  b1.b=400;
		   b1.a=200;
		System.out.println(a1.a);
		System.out.println(a1.b);
		
		
		 System.out.println(b1.a);
		 System.out.println(b1.b);
		
		//System.out.println(a);
		
	}
}