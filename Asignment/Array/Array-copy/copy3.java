/* another method  to copyan array
assign the clone method to the another empty array 
syntax is   
array arrayname=soure array name.clone();   */ 
class text{
	public static void main(String args[]){
		int[] a={1,2,3,4,5};
		int [] b=a.clone();
		System.out.println(b.length);
		for(int i=0;i<a.length;i++){
			System.out.println(b[i]);
		}
	}
}