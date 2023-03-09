// fibanocci series of a given number;
import java.util.*;

class text{
	public static void main(String args[]){
	 Scanner input=	new Scanner(System.in);
	 System.out.print("enter the numebr to get fibanocci :");
	  int a=input.nextInt();
	  int first=0;
	  int next=1;
	  System.out.print(first +" "+next);
	   int i = 1;
	   while (i<a-1)
            {
                int sum = first + next;
                first = next;
                next = sum;
                System.out.print(" " + sum);
                i++;
            }
	}
}
