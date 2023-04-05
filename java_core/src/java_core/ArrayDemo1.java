package java_core;

import java.util.Scanner;

public class ArrayDemo1 {
	public static void main(String[] args) {
		// int a[];  
	 
		int[] a = new int[5];  //java pattern
		 //int b[] = new int[5]	// c pattern
//	for (int i = 0; i < 5; i++) {
//		a[i] = i;
//		System.out.println(a[i]);

      Scanner sc = new Scanner(System.in);
      for (int i = 0; i < 5; i++) {
		System.out.println("enter the value : ");
	    a[i] = sc.nextInt();
	}
      
      for (int i = 0; i < 5; i++) {
		System.out.println(a[i]);
	}
	
  }

}
