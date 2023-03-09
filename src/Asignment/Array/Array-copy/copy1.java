/* one method is copying ann array is assigning the array to the another array */
class text{
	public static void main(String args[]){
		int a[]={1,2,3,4,5};
		//int b[]={a.length};
	
	int []	b=a;
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		//System.out.println(b[]);
		System.out.println("Array copy method");
	}
}