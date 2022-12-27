// program to print least number in a  array
class problem{
	public static void main(String args[]){
		int a[]={10,8,101,567,7};
		int min_no=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]<min_no){
				min_no=a[i];
					System.out.println(" the least number is "+min_no);
			}
		}
		System.out.println(" the least number is "+min_no);
	}
}