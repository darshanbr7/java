/* some predefined functional interfaces
   Function
   it accept one argument and return the argument
   syntax (
   Function <input ,output> variable name;
   Function <Wraper classes> variable name =()->{};
   it return the ".apply()" method
   it only accept one argument ;
   )  
  */
package java8;

import java.util.function.Function;

public class PD_i2 {

	public static void main(String[] args) {
		Function <Integer,Integer>i=(a)->{return a*a; };
		System.out.println(i.apply(10));

	}

}
