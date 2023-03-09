/* 38.What is an anonymous array that also gives an example?
		An array with out any name is called anonymous array.
		they are mainly created for one time use.
		they are pased as a argument to the method.
		*/
		class text{
			public static void main(String args[]){
			System.out.println("Anonymous Array for integer");
			System.out.println(new int[]{1,2,3,4,5}.length);
			System.out.println("Anonymous Array for character");
			System.out.println(new char[]{'a','b','c'}.length);
			System.out.println("Anonymous Array for floating number");
			System.out.println(new float[]{1,2,3,4,5}.length);
			System.out.println("Anonymous Array for double ");
			System.out.println(new double[]{1,2,3,4,5}.length);
			System.out.println("Anonymous Array for boolean");
			System.out.println(new boolean[]{true,true}.length);
			System.out.println("Anonymous Array for string");
			System.out.println(new String[]{"dars","raju"}.length);
			System.out.println("Anonymous Array for multi-dimensional array");
			System.out.println(new int[][]{{1,2,3,4},{1,2,3,4}}.length);
			}
		}
		
