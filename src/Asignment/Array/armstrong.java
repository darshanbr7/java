// armstrong number
class text{
	public static void main(String args[]){
		int a=123;
		int b=a;
		int result=0;
		while(a>0){
			int reminder=a%10;
			result=(reminder*reminder*reminder)+result;
			a=a/10;
		}
		if(b==result){
			System.out.println("Armstrong number");
		}else{
			System.out.println("  not Armstrong number");
		}
	}
}