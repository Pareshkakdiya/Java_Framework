package java_core;

public class Condition4 {
	public static void main(String[] args) {
		int a=13,b=56,c=89;
		if(a>b&&a>c) {
			System.out.println("a is grater");
		}else if(b>a&&b>c) {
			System.out.println("b is grater");
		}else {
			System.out.println("c is grater");
		}
		
		char ch='A';
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			System.out.println("vovel");
		}else {
			System.out.println("consonant");
		}
		
		int percentage=65;
		if(percentage>=70) {
			System.out.println("distinction");
		}else if(percentage>=60) {
			System.out.println("first class");
		}else if(percentage>=50) {
			System.out.println("second class");
		}else if(percentage>=35) {
			System.out.println("third class");
		}else {
			System.out.println("fail");
		}
	}

}
