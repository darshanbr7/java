// number to check wether the number is is 3 digit or not
import java.util.*;
class problem{
	public static void main(String args[]){
		Scanner io=new Scanner (System.in);
		System.out.print(" Enter the number  : ");
		 int a=io.nextInt();
		  if(a<99){
			   System.out.println(" the number has not Three degit");
		  }
		  else if(a>1000){
			   System.out.println(" the number has not Three degit");
		  }
		  else{
			   System.out.println(" the number  has Threee degit");
		  }
	}
}