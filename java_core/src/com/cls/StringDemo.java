package com.cls;

public class StringDemo {
public static void main(String[] args) {
	String s1 = new String("This is Tops Technologies...");
	System.out.println("length is...."+s1.length());
	System.out.println("Original string is..."+s1);
	System.out.println("upparcase is...."+s1.toUpperCase());
	System.out.println("lowercase is...."+s1.toLowerCase());
	System.out.println("sub string is...."+s1.substring(2));
	System.out.println("sub string is...."+s1.substring(2, 5));
	
	if (s1.equals("This is Tops Technologies...")) {
		System.out.println("Both string is same");
	}else {
		System.out.println("Both string is different");
	}
	
	System.out.println("length is..."+s1.length());
	System.out.println("Original stringj is..."+s1);
	
	if (s1.equalsIgnoreCase("this is Tops Technologies...")) {
		System.out.println("Both string is same");
	}else {
		System.out.println("Both string is different");
	}
	
}
}
