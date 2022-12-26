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
	}
}