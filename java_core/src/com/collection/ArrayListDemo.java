package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList a1 = new ArrayList();
	
	System.out.println("Default size is :"+a1.size());
	System.out.println("Default value is :"+a1);
	a1.add(10);
	a1.add('P');
	a1.add("Paresh");
	a1.add(83.5f);
	
	System.out.println("now size is :"+a1.size());
	System.out.println("now value is :"+a1);
	
	a1.add(new Integer(100));
	System.out.println("now size is :"+a1.size());
	System.out.println("now value is :"+a1);
	
	a1.add("Paresh");
	System.out.println("now size is :"+a1.size());
	System.out.println("now value is :"+a1);
	
	a1.remove(1);
	System.out.println("now size is :"+a1.size());
	System.out.println("now value is :"+a1);
	
	a1.remove(Integer.valueOf(10));
	System.out.println("now size is :"+a1.size());
	System.out.println("now value is :"+a1);
	
	a1.remove("Paresh");
	System.out.println("now size is :"+a1.size());
	System.out.println("now value is :"+a1);
	
	a1.remove(2);
	System.out.println("now size is :"+a1.size());
	System.out.println("now value is :"+a1);
	
	Iterator i1 = a1.iterator();
	
	while(i1.hasNext()) {
		System.out.println(i1.next());
	}
	
//	ListIterator iterate in both direction from first to last and last to first also it makes change in 
//	collection list. It second method of iteration.
	
	ListIterator ltir = a1.listIterator();
	
	while(ltir.hasNext()) {
		ltir.set(ltir.next()+" Tops");
	}
	
	System.out.println("***************");
	
    ltir = a1.listIterator();
	while(ltir.hasNext()) {
		System.out.println(ltir.next());
	}
	
	System.out.println("*****************");
	while(ltir.hasPrevious()) {
		System.out.println(ltir.previous());
	}

}
}
