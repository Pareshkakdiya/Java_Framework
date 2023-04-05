package practice_java;

import java.util.PrimitiveIterator.OfDouble;

public class Fibonaci {
//	static void multiplication(int n) {
//		for (int i = 1; i <= 10; i++) {
//			System.out.format("%d X %d = %d\n",n,i,n*i);
//		}
//	}
	
//	static void factorial(int n) {
//		int fact = 1;
//	for (int i = 1; i <=n; i++) {
//		fact = fact * i;
//		
//	}
//	System.out.println("Given number factorial is : "+fact);
//	}
	
//	static int sumRecursion(int n) {
//		if(n==1) {
//			return 1;
//		}else {
//			return n + sumRecursion(n-1);
//		}
//	}
	
//	static void pattern(int n) {
//		for (int i = 1; i <=n; i++) {
//			for (int j = n; j >= i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
	
//	static int  fibonaci0(int n) {
//		if (n==1) {
//			return 0;
//		}else if (n==2) {
//			return 1;
//		}else {
//			return fibonaci0(n-1) + fibonaci0(n-2);
//		}
//	}
	
//	public static int avgArgs(int ...arr) {
//		int sum = 0;
//		int count = 0;
//		int avg = 1;
//		for (int e : arr) {
//			sum = sum + e;
//			count++;
//			avg = sum/count;
//		}
//		return avg;
//	}
//	
	public static void patternRec(int n) {
		if(n>0) {
			
          for (int i = n; i > 0; i--) {
        	  System.out.print("*");
          }
          System.out.println();
          patternRec(n-1);
          
		}	
	}
	
//	
	public static void main(String[] args) {
//		multiplication(7);
//		factorial(5);
//		int c = sumRecursion(5);
//		System.out.println(c);
//		pattern(5);
//		int a = fibonaci0(5);
//		System.out.println(a);
//		System.out.println(avgArgs(4,5,6,7,8));
		patternRec(5);
	}

}
