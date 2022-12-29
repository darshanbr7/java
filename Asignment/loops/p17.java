import java.util.*;
class text{
	public static void main(String args[]){
		 Scanner input =new Scanner (System.in);
		 System.out.print("enter the number to check armstrong or not : ");
		 int num= input.nextInt();
		 int n=num;
		 int reminder;
		 int result=0;
	
		 while(n>0){
			  reminder=n%10;
			  result=result+(reminder*reminder*reminder);
			 n=n/10;
		 }
		 if(num==result){
		 System.out.println(result+ " is a armstrong number");
		 }
		 else{
			System.out.println(result+ " is a not  armstrong number");
		 }
	}
}
  /*import java.util.*;
class text{
	public static void main(String args[]){
		 Scanner input =new Scanner (System.in);
		 System.out.print("enter the number to get reverse ");
		 int n= input.nextInt();
		 int result=0;
		 int reminder=0;
	
		 while(n>0){
			  reminder=n%10;
			  result=result*10+reminder;
			 n=n/10;
			
			 System.out.println(result);
		 }
		 System.out.println("reverse of the number is "+result);
	}
}*/