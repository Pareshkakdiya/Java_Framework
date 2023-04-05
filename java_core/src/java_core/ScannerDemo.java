package java_core;

import java.util.Scanner;

public class ScannerDemo {
public static void main(String[] args) {
	int a,b;
	String string;
	Scanner scanner = new Scanner(System.in);
	Scanner sc1 = new Scanner(System.in);
	System.out.println("enter value of a :");
	a = scanner.nextInt();
	System.out.println("enter value of b :");
	b = scanner.nextInt();
	
	System.out.println("sum of a and b is :"+(a+b));
	
	//scanner.nextLine(); //buffer cleaning
	System.out.println("enter your name : ");
	string = sc1.nextLine();
	System.out.println(string);
	scanner.close();
	sc1.close();
}
}
