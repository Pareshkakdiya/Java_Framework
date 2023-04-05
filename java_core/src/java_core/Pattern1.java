package java_core;

public class Pattern1 {
	public static void main(String[] args) {
//		for (int i = 1; i <= 5; i++) {
//			for (int k = i; k <= 5; k++) {
//				System.out.print(" ");
//			}
//			
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j);
//			}
//		
//			System.out.println();
//		}
		
//		for (int i = 1; i <= 5; i++) {
//			for (int k = 5; k >= i; k--) {
//				System.out.print(" ");
//			}
//			
//			for (int j = i; j >= 1; j--) {
//				System.out.print(j);
//			}
//		
//			System.out.println();
//		}
		
//		for (int i = 5; i >= 1; i--) {
//			for (int k = i; k >=1; k--) {
//				System.out.print(" ");
//			}
//			
//			for (int j = i; j <= 5; j++) {
//				System.out.print(j);
//			}
//		
//			System.out.println();
//		}
		
//	   for (int i = 5; i >= 1; i--) {
//			for (int k = i; k >=1; k--) {
//				System.out.print(" ");
//			}
//
//			for (int j = 5; j >=i; j--) {
//				System.out.print(j+" ");
//			}
//		
//			System.out.println();
//		}
		
//		for (int i = 5; i >=1; i--) {
//			for (int k = i; k >=1; k--) {
//				System.out.print(" ");
//				}
//			
//			for (int j = i; j <=5; j++) {
//				System.out.print(j%2);
//			}
//		
//			System.out.println();
//		}
//		
//		int m=1;
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <=i ; j++) {
//				System.out.print(m++);
//			}
//			System.out.println();
//		}
		
		
		
//		for (int i = 1; i <= 5; i++) {
//			char ch='a';
//			for (int j = 1; j <=i ; j++) {
//				System.out.print(ch);
//				ch++;
//			}
//	
//			System.out.println();
//		}
		

		for (int i = 1; i <=5; i++) {		
			for (int k = 5; k>= i; k--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				}
			System.out.println();
		}
		
		for (int i = 0; i < 5; i++) {
		
			System.out.println((int)Math.pow(11, i));
		}
	}

}
