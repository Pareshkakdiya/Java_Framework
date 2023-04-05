package java_core;

class First{
public First() {
	System.out.println("In constructor first");
     }

public void display() {
	System.out.println("In class first method");
     }
}

class Second extends First{
	public Second() {
		System.out.println("In constructor second");
	}
	
	public void display() {
		super.display();
		System.out.println("In class second method");
	}
}

class Third extends Second{
	public Third() {
	   System.out.println("In constructor third");
	}
	
	public void display() {
		super.display();
		System.out.println("In constructor third method");
	}
}

public class Overriding {
public static void main(String[] args) {
	
//     Second second = new Second();
//     second.display();
	
//	First first = new First();
//	first.display();
//	first = new Second();
//	first.display();
//	first = new Third();
//	first.display();
	
	Third third = new Third();
	third.display();
   }
}
