/* another method to copy an array 
    Arrays.copyOfRange()
	 this method is imported from thr java util package 
	 this method we passes three parameter 
	 1. soure Array
	 2. index from
	 3. destination index
	 
	 */
	 import java.util.*;
	  class text {
		  public static void main(String args[]){
			  int[] a={11,22,44,55,66};
			  int[] b=Arrays.copyOfRange(a,0,a.length);
			  System.out.println(a.length);
			  System.out.println(b.length);
			  for(int i=0;i<a.length;i++){
				  System.out.println(a[i]);
			  }
			   for(int i=0;i<b.length;i++){
				  System.out.println(b[i]);
			  }
		  }
	  }