//  number to check the  given number is armstring number or not
import java.util.*;
class text{
	public static void main(String args[]){
		 Scanner input=new Scanner(System.in);
		 System.out.print(" enter the number to check armstrong  :");
		 int num=input.nextInt();
		 int n=num;
		 int reminder=0;
		 int  result=0;
	
		 while(n!=0){
			 reminder=n%10;
			 result=result+(reminder*reminder*reminder);
			 n=n/10;
			
		 }
		 if(num==result){
			 System.out.println(num+ " is a armstrong number");
		 }else
		 {
			  System.out.println(num +" is not a Armstrong number");
		 }
		
	}
}