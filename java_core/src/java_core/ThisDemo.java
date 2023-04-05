package java_core;

class TDemo{
	long no;
	String name;
	public void setData(long no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public void display() {
		System.out.println("mobile number : "+no);
		System.out.println("name : "+name);
	}
}
public class ThisDemo {
public static void main(String[] args) {
	TDemo tDemo = new TDemo();
	tDemo.setData(7777788888l, "Paresh");
	tDemo.display();
}
}
