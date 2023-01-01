import java.util.*;
class text{
	public static void main(String args[]){
	Scanner input=	new Scanner(System.in);
	System.out.print("enter the size of the array :");
	int n=input.nextInt();
	int[] a=new int[n];
	   for(int i=0;i<n;i++){
		   System.out.print("enter "+(i+1)+" element :");
		   a[i]=input.nextInt();
	   }
	   System.out.println("Array element are ");
	   for(int j=0;j<a.length;j++){
		   System.out.println(a[j]);
	   }
	}
}