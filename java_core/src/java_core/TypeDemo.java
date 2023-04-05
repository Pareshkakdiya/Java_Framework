package java_core;



public class TypeDemo {
	public static void main(String[] args) {
		int i1=20;
		long l1=i1;
		System.out.println("Implicit conversion :"+l1);
		
		long l2=123;
		int i2=(int)l2;
		System.out.println("Explicit conversion of int:"+i2);
		
		double x=511.0;
		int i3=(int)x; 
		System.out.println("Explicit type conversion of int:"+i3);
	}

}
