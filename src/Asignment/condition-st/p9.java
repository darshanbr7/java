// the program to check the numbeer is even or odd
import java.util.*;
class problem{
	public static void main(String args[]){
		 Scanner io=new Scanner(System.in);
		  System.out.print("enter the number  :");
		 int a=io.nextInt();
		
		 System.out.println("entered number is "  +a);
		 if(a%2==0){
			 System.out.println(a +" is a even number");
		 } else 
		 {
			 System.out.println(a +"is  is odd number");
		 }
	}
}