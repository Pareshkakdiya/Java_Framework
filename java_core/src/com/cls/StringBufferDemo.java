package com.cls;

public class StringBufferDemo {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("This is Tops Technology...");
	
	System.out.println("length of the string is ..."+sb.length());
	System.out.println("original string..."+sb);
	
	sb.insert(0, "Hii...");
	System.out.println("length of the string is ..."+sb.length());
	System.out.println("original string..."+sb);
	
	
	sb.append("Paresh...");
	System.out.println("length of the string is ..."+sb.length());
	System.out.println("original string..."+sb);
	
	
	sb.delete(0, 6);
	System.out.println("length of the string is ..."+sb.length());
	System.out.println("original string..."+sb);
	
	sb.reverse();
	System.out.println("length of the string is ..."+sb.length());
	System.out.println("original string..."+sb);
	System.out.println("original string..."+sb.reverse());
	
}
}
