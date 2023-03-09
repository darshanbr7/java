/* another method to copy an array is 
 first we initilize an array of size of privious array
 then goto  iteration 
 in iteration we assigining the value value of the privious array to new array */
class text{
	public static void main(String args[]){
		int[] a={1,2,3,4,5};
		int [] b= new int[a.length];
		
		for(int i=1;i<a.length;i++){
			b[i]=a[i];
		}
		System.out.println(b.length);
	}
}