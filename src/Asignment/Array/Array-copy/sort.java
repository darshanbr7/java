/* Arrays.sort()
  this method is used to arrage the array in increment order.
  it requires two parameter   1.source array.
							  2.array length.
							  */
import java.util.*;
class text{
	public static void main(String args[]){
		int[] a={3,1,8,5,8,9,3};
		System.out.println("before sorting");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		System.out.println("After sorting");
		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}