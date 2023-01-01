// reciving array from the user
import java.util.*;
class text{
	public static void main(String args[]){
		 Scanner input=new Scanner(System.in);
		 System.out.print("enter the Size o the array :");
		 int n=input.nextInt();
		 int[] a=new int[n];
		 for(int i=0;i<n;i++){
			 System.out.print("enter the Array element "+(i+1)+" :");
			 a[i]=input.nextInt();
		 }
		 System.out.println("Array element Are");
		 for(int j=0;j<a.length;j++){
			 System.out.println(a[j]);
		 }
	}
}