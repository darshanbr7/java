// problem to print the given number is divisable by 7 or not
import java.util.*;
class problem{
	public static void main(String args[]){
		 Scanner a=new Scanner(System.in);
		 System.out.print("enter the number  :");
		  int b=a.nextInt();
		  if(b%7==0){
			  System.out.println( b+ " is Divisable by 7");
		  }
		  else{
			  System.out.println(b + " "+"is not Divisable by 7");
		  }
	}
}