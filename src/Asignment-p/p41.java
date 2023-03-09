import java.util.*;
class text{
	public static void main(String args[]){
		int[] a={1,2,3,4};
		int[] b={1,2,3,4,4};
		// for finding the two arrays having same length
		int n=a.length;
		int m=b.length;
		if(n==m){
			System.out.println(" two arrays are eqal in length");
		} else{
			System.out.println(" two arrays are not eqal in length");
		}
		// comparision for same element
		int[] c={1,2,3,4};
		int[] d={4,3,2,1,5};
		Arrays.sort(c);
		Arrays.sort(d);
		/*for(int i=0;i<d.length;i++){
			System.out.println(d[i]);
		}*/
				for(int i=0;i<d.length;i++){
			if(c[i]==d[i]) 
				System.out.println(true);
			
		}

	}
}