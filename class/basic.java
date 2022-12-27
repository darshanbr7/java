// variable types
// 1.local variable
//  2.instance variable
//   3. static variable
class text{
	int b=20;// instance variable
	static int c=30;  // static variable
	public static  void main(String args[]){
		int a =10;  // local variable
		
		System.out.println(a);
		System.out.println(c);
		//System.out.println(b);   // ->error
	}
}