// find dulicate elemnet in java'

// one  method is finding the duplicate Inner looping
import java.util.*;
/*class text{
	public static void main(String args[]){
		int[] a={10,20,30,40,30,20};
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				
					if(a[i]==a[j]&&i!=j ){
					System.out.println(a[i]);
				
				}
			}
		}
	}
}
*/
  
  
  // using set method
  class text{
	public static void main(String args[]){
		int[] a={10,20,30,40,30,20 ,10,40};
		for(int i=0;i<a.length;i++){
			System.out.println("i value "+i);	
			for(int j=i+1;j<a.length;j++){
			if(a[i]==a[j]&&i!=j){
			//System.out.println(a[j]);	
			System.out.println(a[i]);	
			}
				
			}
		}
	}
}
  
  