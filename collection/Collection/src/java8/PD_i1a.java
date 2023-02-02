package java8;

import java.util.function.BiPredicate;

/* some predefined interfaces 
 BiPricate
 it is same as the Predicate method 
 it accept  two argument
 */
public class PD_i1a {

	public static void main(String[] args) {
		//BiPredicate<Integer,Integer> i=(a,b)->{return a+b<=70;};
		BiPredicate<Integer,Integer> i=(a,b)-> a+b<=70;
		System.out.println(i.test(10, 20));

	}

}
