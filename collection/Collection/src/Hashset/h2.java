// methods on HashSet
package Hashset;

import java.util.HashSet;

public class h2 {

	public static void main(String[] args) {
     HashSet a=new HashSet();
     a.add(10);
     a.add(10);
     a.add(20);
     System.out.println(a);
     // it doesn't allows duplicate
     HashSet b=new HashSet();
     
     // adddAll method
     b.addAll(a);
     System.out.println(b);
     
     // is eqals method
     System.out.println(a.equals(b));
     
     // sorting is not applicable 
     
     // contains method 
    System.out.println(a.contains(10));
    
    // 
    System.out.println(a.containsAll(b));
    

	}

}
