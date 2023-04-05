package com.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector v1 = new Vector(2,1);
		
		System.out.println("Default size is..."+v1.size());
		System.out.println("Default value is..."+v1);
		System.out.println("Default capacity is..."+v1.capacity());
		
		v1.add("Paresh");
		v1.add(34);
		v1.add("P");
		v1.add("Paresh");
		v1.add(new Integer(99));
		
//		Iterator i1 = v1.iterator();
//		while (i1.hasNext()) {
//			System.out.println(i1.next());
//		}
		
		Enumeration e1 = v1.elements();
		while (e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
		
		System.out.println("Default size is..."+v1.size());
		System.out.println("Default value is..."+v1);
		System.out.println("Default capacity is..."+v1.capacity());
		
		v1.remove(1);
		v1.remove("Paresh");
		v1.removeElementAt(0);
		v1.remove(new Integer(99));
		System.out.println("Default size is..."+v1.size());
		System.out.println("Default value is..."+v1);
		System.out.println("Default capacity is..."+v1.capacity());
		
		
	}
}
