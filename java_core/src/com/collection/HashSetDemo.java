package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
public static void main(String[] args) {
	HashSet h1 = new HashSet();
	System.out.println("now size is :"+h1.size());
	System.out.println("now value is :"+h1);
	
	h1.add(10);
	h1.add('P');
	h1.add("Paresh");
	h1.add(85.3f);
	h1.add("Paresh");
	
	System.out.println("now size is :"+h1.size());
	System.out.println("now value is :"+h1);
	
	h1.remove("Paresh");
	System.out.println("now size is :"+h1.size());
	System.out.println("now value is :"+h1);
	
	Iterator i1 = h1.iterator();
	
	while (i1.hasNext()) {
		System.out.println(i1.next().equals('P'));
		
	}
	
}
}
