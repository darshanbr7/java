class text{
	text(){
		System.out.println(" constructor  method ");
	}
	public static void main(String args[]){
		  text a=new text();
		
	}
}
/* at the time of the compilation java compiler creates the defalut constructor
  constructor is method as same name as the class name and same Acessmodifier as the class
   it directy execuite at the runtime no needed to separate call.
   
   structure
     class Acessmodifier, className(){
		 super();
	 }
	 */