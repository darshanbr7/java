/* another method is used to copy an arry 
Arrays.copyOf()
this method is imported from "util" package
in Arrays.copyOf()  we passes  two parameter
one is source array,
two is source length
*/
import java.util.*;
class text{
	public static void main(String args[]){
		int a[]={11,22,33,44,55};
		int b[]=Arrays.copyOf(a,a.length);
		System.out.println(b.length);
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
	}
}