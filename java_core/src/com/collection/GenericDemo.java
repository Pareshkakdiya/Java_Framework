package com.collection;

import java.util.ArrayList;

public class GenericDemo {
public static void main(String[] args) {
	ArrayList<Integer> a1 = new ArrayList<Integer>();
	System.out.println("Default size is ..."+a1.size());
	System.out.println("Default value is ..."+a1);
	
	a1.add(123);
	a1.add(new Integer(120));
	
	System.out.println(a1);
}
}
