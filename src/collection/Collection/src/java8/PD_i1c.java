package java8;

import java.util.function.DoublePredicate;
/*
 some predefined methods are
 DoublePredicate
 this method used for double variables
 it returns the boolean values
 */
public class PD_i1c {

	public static void main(String[] args) {
		DoublePredicate i=(a)->{return a>100.00;};
		System.out.println(i.test(10.35));

	}

}
