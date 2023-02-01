package java8;
@FunctionalInterface
interface inter{
	void m1();
	//void m2();
	// if we try to declare more than one abstract  method it cause an error
}

public class Fun_interface {
   public void m1() {
	   System.out.println("method in functional interface");
   }
	public static void main(String[] args) {
		Fun_interface	a= new Fun_interface();
		a.m1();

	}

}
