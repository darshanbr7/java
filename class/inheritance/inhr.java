class parent{
	public  void m1(){
		System.out.println(" parent class  m1 method");
	}
	public  void m2(){
		System.out.println(" parent class  m2 method");
	}
}
class child extends parent{
	public  void m3(){
		System.out.println(" child class  m3 method");
	}
}
class text{
	public static void main(String args[]){
	parent p1=	new parent();
	p1.m1();
	p1.m2();
	//p1.m3(); //Compile Error
	System.out.println("*********");
	parent p2 =new child();
	p2.m1();
	p2.m2();
	//p2.m3(); // Compile Error
	System.out.println("*********");
	//child c1=new parent(); // Compile Error
	child c2=new child();
	c2.m1();
	c2.m2();
	c2.m3();
	}
}

/* what is Inheritance ?
   it is concept that Acquire the properties from one class to another class    OR
   Acuquiring a properties from parent class to child class.
   
   link the child class to parent class using "extends " keyword.
   
   in java we can extract the properties from parent to child
   And not support chld to parent.
   
   in creating object the possible ways are
   1-> we can acess the parent properties in child but not possible child properties in parent.
   2-> parent can hold the child class but chid con't hold the parent class.
   
    in givin examples 
	parent p1=	new parent();
	p1.m1();
	p1.m2();
	 class is parent and its type is also parent
	 
	parent p2 =new child();
	p2.m1();
	p2.m2();
	class is chid but type is parent  
	in this case we can acess only Parent properties.
	
	child c1=new parent(); // Compile Error
	child can not hold the parent 
	thats whys it leads to compile time error
	
	child c2=new child();
	c2.m1();
	c2.m2();
	c2.m3();
	in child class. class is also child and type is also chid
	in this case we can Acess the parent properties also */
   
   
   