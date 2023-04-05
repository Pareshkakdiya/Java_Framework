package com.cls;

class Dog{
	public void bark() {
		
	}
}

public class ObjectClassDemo {
public static void main(String[] args) {
	
	Object o1 = new Object();
	String s1 = "Tops";
	o1 = "tops";
	
	if (o1.equals(s1)) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
	
	Dog d1 = new Dog();

}
}
