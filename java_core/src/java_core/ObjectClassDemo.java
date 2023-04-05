package java_core;

public class ObjectClassDemo {
	
		public static void main(String[] args) {
			
			Object o1 = new Object();
			String s1 = "tops";
			o1 = "tops";
			
			if (o1.equals(s1)) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
		}
		}

