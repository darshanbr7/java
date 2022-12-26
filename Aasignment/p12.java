// program to find gretar number in 
import java.util.*;
class problem{
	public static void main(String args[]){
		 Scanner input=new Scanner (System.in);
		 System.out.print(" Enter the first number :");
		 int a=input.nextInt();
		 System.out.print(" Enter the second number :");
		 int b=input.nextInt();
		 if(a>b){
			 System.out.println(a+" is gretar  number" );
		 }
		 else{
			  System.out.println(b+" is gretar number" );
		 }
		 
		 Scanner input1=new Scanner (System.in);
		 System.out.print(" Enter the first number :");
		 int c=input1.nextInt();
		 System.out.print(" Enter the second number :");
		 int d=input.nextInt();
		 if(c<d){
			 System.out.println(c+" is least  number" );
		 }
		 else{
			  System.out.println(d+" is least number" );
		 }
	}
}