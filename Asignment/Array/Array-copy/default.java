//  37.What is the default value of the array?
   // for integer Array default value is      0
   // for double Array default value is       0.0
   // for float Array default value is        0.0
   // for String  Array default value is       null
   // for boolean Array default value is       false
   // for reference Array default value is      null
   // 
   import java.util.*;
class text{
	public static void main(String args[]){
		System.out .println("integer Array");
		int[] a=new int[5];
		System.out.println(a.length);
		for(int value :a)
			System.out.println(value+" ");
		
		System.out .println("double Array");
		double[] b=new double[5];
		System.out.println(b.length);
		for(double val :b)
			System.out.println(val+" ");
		
		System.out .println("float Array");
		float[] c=new float[5];
		System.out.println(c.length);
		for(float val :c)
			System.out.println(val+" ");
		
		System.out .println("string Array");
		String [] d=new String[5];
		System.out.println(d.length);
		for(String val :d)
			System.out.println(val+" ");
		
		System.out .println("boolean Array");
		boolean[] e=new boolean[5];
		System.out.println(e.length);
		for(boolean val :e)
			System.out.println(val+" ");
		
		System.out .println("reference array Array");
		text[] f=new text[5];
		System.out.println(f.length);
		for(text val :f)
			System.out.println(val+" ");
	}
}