// 28  write a program to print a reverse degit of a number
  import java.util.*;
  class text{
	  static  int reverse(int a){
		   int rev=0; // reversed number
		   int rem;  // reminder
		  
		   while(a>0){
			   rem=a%10;
			   rev=(rev*10)+rem;
			   a=a/10;
		   }
		   return rev;
		   }
	        public static void main(String args[]){
		  Scanner input=  new Scanner(System.in);
		  System.out.print("Enter the numner to get reverse : ");
		   int a=input.nextInt();
		   System.out.println(" Reverse Of a number is  "+reverse(a));
	   }
	  
	  
	 
  }