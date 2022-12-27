// program to find the factorial of the given number
import java.util.*;
class factor{
	public static void main(String args[]){
		  int fact=1;
		 Scanner input=new Scanner(System.in);
		 System.out.print(" Enter the number to get factorial :");
		int a=input.nextInt();
		for(int i=1;i<=a;i++){
			System.out.println(" number is :"+i);
			fact=fact*i;
		}
		System.out.println("Factorial is  :"+ fact);
	}
	
}