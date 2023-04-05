package java_core;

abstract class ADemo{
	long mo_no;
	String name;
    public abstract void setData();

	
	public void display() {
		System.out.println("mobile no :"+mo_no);
		System.out.println("name :"+name);
	}
}

class Demo extends ADemo{

	@Override
	public void setData() {
		mo_no = 9099592962l;
		name = "Paresh";
		
	}
	
}

public class KeywordsDemo {
public static void main(String[] args) {
	Demo demo = new Demo();
	demo.setData();
	demo.display();
}
}
