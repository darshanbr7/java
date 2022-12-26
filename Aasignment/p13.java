// to find the gretar and lesser number is the given 3 number
import java.util.*;
class problem{
	public static void main(String args[]){
		Scanner input=new Scanner (System.in);
		 System.out.print(" Enter the first number :");
		 int a=input.nextInt();
		 System.out.print(" Enter the second number :");
		 int b=input.nextInt();
		 System.out.print(" Enter the Third number :");
		 int c=input.nextInt();
		 if(a>b&&a>c){
			 System.out.println(a+" is gretar  number" );
		 }
		 else if(b>a&&b>c){
			  System.out.println(b+" is gretar number" );
		 }
		 else{
			System.out.println(c+" is gretar number" ); 
		 }
		 
		 Scanner input1=new Scanner (System.in);
		 System.out.print(" Enter the first number :");
		 int a1=input1.nextInt();
		 System.out.print(" Enter the second number :");
		 int b1=input.nextInt();
		 System.out.print(" Enter the Third number :");
		 int c1=input.nextInt();
		 if(a1<b1&&a1<c1){
			 System.out.println(a1+" is lesser number" );
		 }
		 else if(b1<a1&&b1<c1){
			  System.out.println(b1+" is lesser number" );
		 }
		 else{
			System.out.println(c1+" is lesser number" ); 
		 }
	}
	
}