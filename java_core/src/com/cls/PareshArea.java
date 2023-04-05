package com.cls;


import java.util.Scanner;

class Suare{
	int a;
	int area;
	public int areaOfSquare() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter value :");
	    a = scanner.nextInt();
		area =a*a;
		return area;
	}

}

public class PareshArea {
public static void main(String[] args) {
	Suare s1 = new Suare();
	int b = s1.areaOfSquare();
	System.out.println(b);
   
}
}
