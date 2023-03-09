class logical{
	public static void main(String args[]){
		//logical And
		int a=10;
		int b=21;
		System.out.println(a>b&&b>a);
		System.out.println(a<b&&b>a);
		// in logical and operator it compares the two values and then returns the bollean value
		
		int c=10;
		int d=21;
		System.out.println(c>d||d>c);
		System.out.println(c<d||d<c);
		// in logical or operator it compares the two values and then returns the bollean value
		
		int e=15;
		System.out.println(!(e>14));
		System.out.println(!(e>17));
		// in logical not operator it converts the true value to false value
	}
}