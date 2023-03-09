 // some pre defined functional interfaces
/* Predicate
it accept the one argument and return the boolean value
 syntax of Predicate
  Predicate<Wraper Class Name> variable Name=(parameter)->{};
  to acessPredecate method we use the ".text();
 */
package java8;

import java.util.function.Predicate;

public class PD_i1 {
	//static Predicate <Integer> i=(a)->{return a>100;};
     static Predicate <Double> i=(a)->{return a>100;};
	public static void main(String[] args) {
		System.out.println(i.test(10.00));

	}

}
