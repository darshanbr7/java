// constructor 
class text{
	int a;
	String name;
	text(int a,String b){
		this.a=a;
		this.name=b;
	}
	 void display(){
		System.out.println( a+" "+name);
	}

	
	public static void main (String args[]){
		 text m=new text(10,"darshan");
		 text m1=new text(11, "chirag");
		 text m2=new text(12, "muni");
		 m.display();
		 m1.display();
		 m2.display();
	}
}