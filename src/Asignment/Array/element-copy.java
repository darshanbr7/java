  /* 39.How many ways to find the duplicate elements in an array?
    to find the duplicate element in  the array we use the two loops 
	  1.innerloop
	  2.outer loops
	  
	  */
	  import java.util.*;
	class text{
		public static void main(String args[]){
			int a[]={1,2,3,4,5,6,7,8,9,7,6,5,4,2};
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a.length;j++){
					if(i!=j&&a[i]==a[j]){
						System.out.println("Duplicate elements are "+a[i]);
					}
				}
			}
		}
	}
	
	/* another way to find a duplicate is using list method 
	in this method nested looping is necessary */
	class text1{
		public static void main(String args[]){
			int a[]={1,2,3,4,5,6,7,8,9,7,6,5,4,2};
		List<Integer> duplicate = new ArrayList<>();
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a.length;j++){
					if(i!=j&&a[i]==a[j]&&!duplicate.contains(a[i])){
						duplicate.add(a[i]);
					}
				}
			}
			System.out.println("duplicate elements");
			System.out.println(duplicate);
		}
	}
	
	/* using set method to find the duplicate element
	using in this consition we must use the "for each" loop otherwise 
	loops does not goes to an iteration  
	 it don't needed the nested looping.
	*/
	
	class text2{
		public static void main(String args[]){
			int a[]={1,2,3,4,5,6,7,8,9,7,6,5,4,2};
			Set<Integer> set=new HashSet<>();
			for(int i:a){
				if(!set.add(i)){
					System.out.println("duplicate elements are "+i);
				}
			}
		}
	}
	
	