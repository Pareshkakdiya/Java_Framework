package java_core;

public class Conversion {
	public static void main(String[] args) {
		int i=256;
		byte b= (byte)i;
		double d= 323.456;
	    byte b1= (byte)d;
	    byte b2= 0;
	    int i3=(int)b2;
	    int i1= b2;
	    int i2=(int)d;
		System.out.println("conversion of int to byte"+i+" "+b);
		System.out.println("conversion of double to byte"+d+" "+b);
		System.out.println("conversion of int to double"+d+" "+i2);
		System.out.println("conversion of byte to int"+b2+" "+i);
	}

}