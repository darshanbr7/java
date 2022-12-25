// problem -- to print odd number in b/w 1 to 50;
class problem{
	public static void main(String args[]){
		for (int i=0; i<=50;i++){
			if(i%2!=0){
				System.out.println(i);
			}
		}
		// for even number in
		int j=0;
		while(j<=50){
			if(j%2==0){
				System.out.println(j);
				}
			j++;
		}
	}
}