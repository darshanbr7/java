// primitive data types
class data{
	 static float b;
	 static short e1;
	 static long f1;
	 static boolean h1;
	 static char i1;
	public static void main (String args[]){
		int a=10;
		System.out.println(a);
		// for number it allows only whole numbes  , not allows decimel number
		float c;
		System.out.println(b);
		// we declare the float number with float keyword and it ends with a suffics "f"
		byte d=127;
		System.out.println(d);
		//  byte value declared using byte keyword its range -128 to +127  and default value is 0
		short e=127;
		System.out.println(e);
		System.out.println(e1);
		//  short value declared using short keyword its range -32768 to +3267  and default value is 0
		long f=-123;
		System.out.println(f);
		System.out.println(f1);
		// long values are declared using "long" keyword  it's range is 2^64   it's default valu is 0
		double g=1152561;
		System.out.println(g);
		// double values is declare using "double" keyword   its range is unlimited and its default value is  "0"
		boolean h=true;
		System.out.println(h);
		System.out.println(h1);
		// boolean value  declare using "boolean " keyword   its default value is "false"
		char i='h';
		System.out.println(i);
		System.out.println(i1);
		// character is declared using "char" keyword  .  it is enclosed by sinleQoutes   '',  its only allows character
		
	}
}