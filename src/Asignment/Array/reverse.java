// we can also print the reverse array using decrement order   but it read only data it con't be stored
class text{
	public static void main(String args[]){
		int[] a={11,22,33,44,55,66};
		System.out.println("normal iteration");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		System.out.println("reverse iteration");
		int[] b=new int [a.length];
	     for(int j=a.length-1;j>=0;j--){
				 System.out.println(a[j]);	
		}
		
		
	}
}