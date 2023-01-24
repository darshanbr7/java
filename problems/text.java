
package pack;
 public class text{
	 public void m1(){
public static int a=12;
// private static int b=12; // compile error
final static int c=22;
 static int d=12;
volatile static int e=52;
	 }
	
}
class text1{
  public static void main(String args[]){
	  text z=new text();
	  System.out.println(text.a);
	  //System.out.println(text.b);
	  System.out.println(text.c);
	  System.out.println(text.d);
	  System.out.println(text.e);
  }
  
  
}
/* in a variable level  there are 5 types 
  1.public
  2.static
  3.private
  4.final
  5.volatile
  
  public 
   it can be acessable in anyware.
   
   private
   it only Acessable in a class not Accessable in a differenet classes
   
   final
    itcan be Acessable in a different class in a same package.
	
	static
    itcan be Acessable in a different class in a same package.
	
	volatile
    itcan be Acessable in a different class in a same package.
	
	*/
	