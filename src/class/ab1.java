abstract class car{
	abstract void run();
}
class i20 extends car{
	void run(){
		System.out.println(" run smoothly");
	}
	public static void main(String args[]){
		  i20 a=new i20();
		  a.run();
	}
}