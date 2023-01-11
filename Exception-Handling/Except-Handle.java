/* what is Exception handling?
   Exception Handling is a mechanism to maintain the Reun time error, so that the narmal flow of application 
   is continued.
    */
	class text{
		public static void main(String args[]){
			try{
				int a=null;
				System.out.println(a.length());
			System.out.print(0/0);//ArithmeticException error
			}catch (ArithmeticException e){
				System.out.println("in java 0 Con't devide anything it is  ArithmeticException");
			}
			catch (Exception e){
				System.out.println("in java 0 Con't devide anything");
			}
		}
	}
