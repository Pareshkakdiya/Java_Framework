package com.collection;

public class GenericDemo2 {
	int[] a = {1,2,4,5,6,};
 public static <E> void printArray(E[] inputarray) {
	for(E a : inputarray) {
		System.out.print(" "+a);
	}
	System.out.println();
}

public static void main(String[] args) {
	Integer intArray[] = {1,2,3,4,5};
	Double doubleArray[] = {2.3,5.6,4.5,8.6,9.4};
	Character charArray[] = {'Y','P','M','F','W'};
	String strArray[] = {"Paresh", "Jinal", "Ashok", "Vaibhav", "Krunal"};
	
	printArray(intArray);
	printArray(doubleArray);
	printArray(charArray);
	printArray(strArray);
}
}
