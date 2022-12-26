// number to check wether the number is positive or negetive
import java.util.*;
class problem{
	public static void main(String args[]){
		Scanner io=new Scanner (System.in);
		System.out.print(" Enter the number  : ");
		 int a=io.nextInt();
		  if(a>0){
			   System.out.println(" the number is positive");
		  }
		  else if(a<0){
			   System.out.println(" the number is negetive");
		  }
		  else{
			   System.out.println(" the number is Zero");
		  }
	}
}