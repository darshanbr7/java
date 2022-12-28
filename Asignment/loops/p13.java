import java.util.*;
class text{
	public static void main(String args[]){
		  Scanner input=  new Scanner(System.in);
		 System.out.print("Enter the numner to get reverse : ");
		   int a=input.nextInt();
		   int  reverse=0;
		   int reminder=0;
		   
		   while(a>0){
			   reminder=a%10;
			   reverse=reverse*10+reminder;
			   System.out.println(reverse);
			   a= a/10;
			   
		   }
	    System.out.println("reverse of a number is "+ reverse);
		System.out.println(0.23%10);
	}
	
} 