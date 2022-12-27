class text{
	int a=10;
	int b=20;
	static int c=30;
	public static void main( String args[]){
		text d=text.add();
		  text a1=new text();
		  text a2=new text();
		  System.out.println(a1.a);
		  System.out.println(a1.b);
		  System.out.println(a1.c);
		  System.out.println(a2.a);
		  System.out.println(a2.b);
		  System.out.println(a2.c);
		  a2.c=200;
		  System.out.println(a2.c);
		  System.out.println(d);
	}
	public static  void add(){
		text a3=new text();
		a3.a=40;
		  System.out.println(a3.a);
		
	}
	
}