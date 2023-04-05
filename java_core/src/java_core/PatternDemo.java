package java_core;

public class PatternDemo {
	public static void main(String[] args) {
//		int i,j;
//		for(i=1;i<=5;i++) {
//			for(j=i;j>=1;j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		
//		int i,j;
//		for(i=5;i>=1;i--) {
//			for(j=5;j>=i;j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				
				System.out.print(j%2);
			}
			System.out.println();
		}
	}

}
