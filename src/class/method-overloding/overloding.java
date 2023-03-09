class text{
	void m1(){
		System.out.println("method with zero orgument");
	}
	void m1(int a){
		System.out.println("method with int orgument");
	}
	void m1(int a,int b){
		System.out.println("method with 2 int orgument");
	}
	void m1(float a){
		System.out.println("method with float orgument");
	}
	void m1(double a){
		System.out.println("method with double orgument");
	} 
	void m1(String a){
		System.out.println("method with String orgument");
	}
	void m1(){}
	public static void main(String args[]){
		  text a=new text();
		  a.m1();
		  a.m1(10,20);
		  a.m1(10.00);
		  a.m1(10.0f);
		  a.m1("drshan");
	}
}
/* method overloding 
 in  a class which contain same method but different arguments 
  
    ->  it con't allow  multiple times the same method with the same argument
	-> if the same data type argument is not present  it undergoes the type conversion at the compile time.
	   ex:  void m1(double a){}
	   a.m1(13);  it internaly converts integer to double.
	   */
 */