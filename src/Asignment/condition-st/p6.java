// problem to print the number id divisable by 3 or not
import java.util.*;
class problem{
	public static void main(String args[]){
		 Scanner io=new Scanner(System.in);
		 System.out.print("enter the number  :");
		 int b=io.nextInt();
		 if(b%3==0){
			 System.out.println(b +" is divisable by 3");
		 }
		 else{
			  System.out.println(b +" is  Not divisable by 3");
		 }
	}
	
}
