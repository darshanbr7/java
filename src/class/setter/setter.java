  class set{
	private String name;
	 public  String getName(){
		 return name;
	 }
     public  void setname(String newName){
	  this.name=newName;
     }
}
class text extends set{
	public static void main(String args[]){
	 set a=new set();
	a.setname("darshan");
	 System.out.println(a.getName());
		
		
	}
}