import java.util.*;
class text{
	public static void main(String args[]){
	Scanner input=	new Scanner(System.in);
	System.out.print("Enter the first number :");
	int a=input.nextInt();
	int c=a;
	System.out.print("Enter the second number :");
	int b=input.nextInt();
	int d=b;
	System.out.println("Before swap");
	System.out.println("a="+a);
	System.out.println("b="+b);
	a=c+d-c;
	b=d+c-d;
	System.out.println("After  swap");
	System.out.println("a="+a);
	System.out.println("b="+b);
	
	}
}