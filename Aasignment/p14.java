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
		if(a<b){
			if(b<=c){
				 System.out.println(" the incrment order is "+a+" "+b+" "+c);
			 }
			 if(c<=b){
				 System.out.println(" the incrment order is "+a+" "+c+" "+b);
			}
		}else if(b<c){
			 if(a<=c){
				 System.out.println(" the incrment order is "+b+" "+a+" "+c);
			 }
			 if(c<=a){
				System.out.println(" the incrment order is "+b+" "+c+" "+a);
			 }
		} else{
			 if(a<=b){
				 System.out.println(" the incrment order is "+c+" "+a+" "+b);
			 }
			 if(b<=a){
				System.out.println(" the incrment order is "+c+" "+b+" "+a);
			 }
			
		 }
		Scanner input1=new Scanner (System.in);
		 System.out.print(" Enter the first number :");
		 int a1=input1.nextInt();
		 System.out.print(" Enter the second number :");
		 int b1=input1.nextInt();
		 System.out.print(" Enter the Third number :");
		 int c1=input1.nextInt();
		if(a1>b1){
			if(b1>=c1){
				System.out.println("The decrement order is "+a1+" "+b1+" "+c1);
			}else if(c1>=b1){
				System.out.println("The decrement order is "+a1+" "+c1+" "+b1);
			}
		}
		else if(b1>=c1){
			if(c1>a1){
			System.out.println("The decrement order is "+b1+" "+c1+" "+a1);
			}
			else {
			System.out.println("The decrement order is "+b1+" "+a1+" "+c1);
			}
		}else if(c1>=a1){
			if(a1>=b1){
				System.out.println("The decrement order is "+c1+" "+a1+" "+b1);
			}
			else {
				System.out.println("The decrement order is "+c1+" "+b1+" "+a1);
			}
		
		}
	}
}