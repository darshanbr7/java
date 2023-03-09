class st{
	private  String name;
	private int  id;
	public void setname(String name){
		this.name=name;
	}
	public String getname(){
		return name;
	}
	public void setid(int id){
		this. id=id;
	}
	public int getid(){
		return id;
	} 
}
class text extends st{
	public static void main(String args[]){
		 st a=new st();
		 a.setname("darshan");
		 a.setid(101);
		 System.out.println(a.getname());
		 System.out.println(a.getid());
	}
}

/*  in setter we gives  the argument
  in getter we  must write the return type   */