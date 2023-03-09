 //  p1-->  write a program to find first 5 numbers which are devisable  by 2 ,3 5
class text{
	public static void main(String args[]){
		// 5 numbers are devisable by 2
		for(int i=1;i<=10;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
		// 5 numbers are devisable by 3
		for(int i=1 ;i<=15;i++){
			if(i%3==0){
				System.out.println(i);
			}
		}
		// 5 numbers devisable by 5
		for(int i=1 ;i<=25;i++){
			if(i%5==0){
				System.out.println(i);
			}
		}
		// 5 numbers are devisable by 2,3& 5
		for(int i=1;i<=150;i++){
			if(i%5==0){
				if(i%2==0&&i%3==0){
					System.out.println(i);
				}
			}
		}
	}
	
}