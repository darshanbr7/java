// 27   -- write a program to find a factor of 24
import java.util.*;
class text{
	public static void main(String args[]){
		 Scanner input=new Scanner(System.in);
		 System.out.print("enter the number to get factor :");
		  int a=input.nextInt();
		  for(int i=1;i<=a;i++){
			  if(a%i==0){
				  System.out.println(i);
			  }
		  }

	}
}