// p2)   program to print number 1to 100 which are divisanle by 3,5 and both
class text{
	public static void main(String args[]){
		System.out.println("numbers are devisable by 3");
		for(int i=1;i<=100;i++){
			if(i%3==0){
				System.out.println(i);
			}
		}
		System.out.println("numbers are devisable by 5");
		for(int i=1;i<=100;i++){
			if(i%5==0){
				System.out.println(i);
			}
		}
		System.out.println("numbers are devisable by 3 and 5");
		for(int i=1;i<=100;i++){
			if(i%3==0&&i%5==0){
				System.out.println(i);
			}
		}
	}
}