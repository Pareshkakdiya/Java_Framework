package com.exeception;

import java.util.Scanner;

public class ExceptionHandlingDemo1 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("enter no1 : ");
	int a = scanner.nextInt();
	
	System.out.println("enter no2 : ");
	int b = scanner.nextInt();
	
	try {
		System.out.println("sum :"+(a/b));
		System.out.println("Program is sucessfull..");
	} 
	catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println(e);
		e.printStackTrace();
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
		e.printStackTrace();
	}
	
	System.out.println("Hello ....1");
}
}
