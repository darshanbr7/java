 /* another method to copy an array 
   System.arraycopy();
   in arraycopy method we pass 5 arguments
  * src denotes the source array.
  *  srcPos is the index from which copying starts.
  *  dest denotes the destination array
  *  destPos is the index from which the copied elements are placed in the destination array.
  *  length is the length of the subarray to be copied.
        */

class text{
	public static void main(String args[]){
		int[] a={11,22,33,44,55};
		int[] b=new int[a.length];  // new array with the same length as the source array
		System.arraycopy(a,0,b,0,5);
		System.out.println(b.length);
		for( int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
	}
}