class text{
	public static void main(String args[]){
		int[] a={21,22,55,11,8};
		int temp=0;
		System.out.println("original order");
		for(int i=0;i<a.length;i++){
			System.out.println(" "+a[i]);
		}
		System.out.println("increment order");
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					System.out.println("temp value is "+temp);
					System.out.println("a[i] value is "+a[i]);
					System.out.println("a[j] value is "+a[j]);
					System.out.println(" ****");
					for(int k=0;k<a.length;k++){
						System.out.print(" "+a[k]);
					}
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					System.out.println("");
					System.out.println("temp value is "+temp);
					System.out.println("a[i] value is "+a[i]);
					System.out.println("a[j] value is "+a[j]);
					System.out.println(" ****");
					for(int k=0;k<a.length;k++){
						System.out.print(" "+a[k]);
					}
					System.out.println("");
				}
			}
		}
		/*System.out.println("sorted  order");
		for(int i=0;i<a.length;i++){
			System.out.println(" "+a[i]);
		}
		
		System.out.println("decrement order");
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("sorted  order");
		for(int i=0;i<a.length;i++){
			System.out.println(" "+a[i]);
		}*/
	}
}