package java_core;

class SDemo{
	int no;
	static int s_no;
	
	public static void show() {
		int r_no;
		s_no = 12345;
		System.out.println("S_no....."+s_no);
	}
}
public class StaticDemo {
public static void main(String[] args) {
	SDemo s1 = new SDemo();
	SDemo s2 = new SDemo();
	SDemo s3 = new SDemo();
	 
//	s1.show();
	SDemo.show();
	s1.no = 1;
	s2.no = 2;
	s3.no = 3;
	
	System.out.println("val of s1.no :"+s1.no);
	System.out.println("val of s2.no :"+s2.no);
	System.out.println("val of s3.no :"+s3.no);
	
	s1.s_no = 10;
	s2.s_no = 20;
	s3.s_no = 30;
	
	System.out.println("val of s1.s_no :"+s1.s_no);
	System.out.println("val of s2.s_no :"+s2.s_no);
	System.out.println("val of s1.s_no :"+s1.s_no);
}
}
