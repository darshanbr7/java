// inner looping concept  in java 
 // loop inside a loop  is called the inner looping
class text{
	public static void main(String args[]){
		int[] a={1,2,3,4,5};
		for(int i=0;i<a.length;i++){
			System.out.println(  " i value is "+i);
			for(int j=0;j<a.length;j++){
				System.out.println("j value is "+j);
			}
		}
	}
}