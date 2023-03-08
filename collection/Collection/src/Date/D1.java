package Date;

import java.time.Year;

public class D1 {

	public static void main(String[] args) {
		// using the date method 
		int a=2021;
	if(Year.isLeap(a)) {
		System.out.println("yes it is leap year");
	}else {
		System.out.println("not a leap Year");
	}

	}

}
