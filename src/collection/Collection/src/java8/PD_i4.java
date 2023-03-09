package java8;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
/*
  supplier - predefined Functional interface
  it did't accept input and it only gives the output
  it gives the get() method
  
  DoubleSupplier- it returns the Double value
  it gives the .getAsDouble() method
  
  IntSupplier- it returns the integer value
  it gives the .getAsint() method
 */
import java.util.function.Supplier;

public class PD_i4 {
	public static void main(String[] args) {
		IntSupplier k=()->(int)(Math.random()*10);
		Supplier<Double> i=()->Math.random();
		DoubleSupplier j=()->Math.random();
		LongSupplier l=()->(long)(Math.random()*10);
		BooleanSupplier m=()->false;
		System.out.println(i.get());
	   System.out.println(j.getAsDouble());
	   System.out.println(k.getAsInt());
	   System.out.println(i.get());
		System.out.println(l.getAsLong());
		System.out.println(m.getAsBoolean());
		
	}

}
