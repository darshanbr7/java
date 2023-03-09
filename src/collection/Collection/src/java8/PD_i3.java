package java8;
/*   some predefined interfaces 
  Consumers
  it accepts one argument and not return anything
  */
import java.util.function.Consumer;

public class PD_i3 {

	public static void main(String[] args) {
		Consumer<Integer> i=( a)->{System.out.println(a);};
		i.accept(10);

	}

}
