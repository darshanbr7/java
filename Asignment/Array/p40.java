// print the array element  in the increment order
import java.util.*;
class text{
	public static void main(String args[]){
		 Scanner input=new Scanner(System.in);
		 System.out.print("Enter the size :");
		 int n=input.nextInt();
		 int[] arr=new int[n];
		 for( int i=0;i<n;i++){
			 System.out.print(" enter the "+(i+1)+" th element :");
			   arr[i]=input.nextInt();
		 }
		 System.out.println("aray  elements are");
		 for(int i=0;i<arr.length;i++){
			 System.out.print(" "+arr[i]);
		 }
		 int temp=0;
		 for(int i=0;i<arr.length;i++){
			 for(int j=i+1;j<arr.length;j++){
				 if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				 }
			 }
		 }
		 System.out.print("******* ");
		  System.out.println("aray  elements are in increseing order");
		  for(int i=0;i<arr.length;i++){
			 System.out.print(" "+arr[i]);
		 }
	}
}