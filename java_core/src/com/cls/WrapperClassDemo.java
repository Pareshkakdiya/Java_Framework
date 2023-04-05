package com.cls;


public class WrapperClassDemo {
public static void main(String[] args) {
	Integer i1 = new Integer(123);
	Float f3 = new Float(32.45);
	
	System.out.println("auto boxing is..."+f3);
	System.out.println("auto boxing is..."+i1);
	
	String s1 = new String("Tops");
	System.out.println("auto boxing is..."+s1);
	
	int i2 = 12345;
	System.out.println("boxing is..."+i2);
	
	int var1 = i1;
	System.out.println("un boxing..."+var1);
	
	String s2 = "456";
	String s3 = "789";
	int val2 = Integer.parseInt(s2);
	int val3 = Integer.parseInt(s3);
	System.out.println("sum..."+s2+s3);
	System.out.println("sum..."+(val2+val3));
	
	
	String s4 = "85.3";
	String s5 = "23.6";
	
	float abc=123.00f;
	String string=Float.toString(abc);
	System.out.println(string);
	
	float f1 = Float.parseFloat(s4);
	float f2 = Float.parseFloat(s5);
	System.out.println("sum..."+(f1+f2));
	
	
}
}
