class animal{
	public void sound(){
		System.out.println("animal make sounds");
	}
}
class dog extends animal{
   	public void sound(){
		System.out.println("bow bow");
	}
}
class cat extends animal{
   	public void sound(){
		System.out.println("meow meow");
	}
}
class text{
	public static void main(String args[]){
	animal a=	new animal();
	dog b=	new dog();
	cat c=	new cat();
	a.sound();
	b.sound();
	c.sound();
	
	}
}
/* in a polimorphism  a same method can act as a different in different classs 
 is called a polimorphism */