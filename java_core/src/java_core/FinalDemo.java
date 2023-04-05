package java_core;

final class FDemo{
	final long mo_no = 8888899999l;
	String name;
	
	public final void setName() {
		name = "just dial";
	}
	
	public void display() {
		System.out.println("mobile no : "+mo_no);
		System.out.println("name : "+name);
	}
}

//class Demo extends ADemo{
//	public void setName() {
//		name = "just dial";
//	}
//}

public class FinalDemo {
public static void main(String[] args) {
	FDemo fDemo = new FDemo();
	fDemo.setName();
	fDemo.display();
   }
}
  