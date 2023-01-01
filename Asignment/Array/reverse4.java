//sorting order  for decrement order
class text{
	public static void main(String args[]){
		int temp=0;
		int[] a={22,1,4,77,55};
		System.out.println("Before sorting");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("After sorting");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}