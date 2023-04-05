package java_core;

public class Bytedemo {
public static void main(String[] args) {
	int i1=10;
	long l1=20000000000l;
	char cc='t';
	float f1=42.35f;
	double d1=45.234556;
	byte b1=127;
	boolean bb=true;
	
	System.out.println("Integer is:"+i1);
	System.out.println("long is:"+l1);
	System.out.println("char is"+cc);
	System.out.println("float is:"+f1);
	System.out.println("double is:"+d1);
	System.out.println("byte is:"+b1);
	System.out.println("boolean is:"+bb);
	
	System.out.println("Size of integer :"+Integer.BYTES+"bytes");
	System.out.println("Size of long :"+Long.BYTES+"bytes");
	System.out.println("Size of character :"+Character.BYTES+"bytes");
	System.out.println("Size of float :"+Float.BYTES+"bytes");
	System.out.println("Size of double :"+Double.BYTES+"bytes");
	System.out.println("Size of byte :"+Byte.BYTES+"bytes");
	
}
}
