// program to print gretest number i the given numbers
class problem{
	public static void main(String args[]){
		int [] arr={10,20,30,40,28};
		int max_no=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max_no){
				max_no=arr[i];
			}
			
		}
		System.out.println( "heighest no is :"+max_no);
	}
	
}