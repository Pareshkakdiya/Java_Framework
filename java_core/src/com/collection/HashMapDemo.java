package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class HashMapDemo {
public static void main(String[] args) {
	HashMap h1 = new HashMap(); 
	System.out.println("default size is :"+h1.size());
	System.out.println("default value is :"+h1);
	h1.put(1, "tops");
	h1.put("Jignesh", "Patel");
	h1.put("Paresh", 1234);
	h1.put(2, "tops");
	
	System.out.println("default size is :"+h1.size());
	System.out.println("default value is :"+h1);
	
	h1.remove("Paresh");
	h1.remove(2);
	
	System.out.println("default size is :"+h1.size());
	System.out.println("default value is :"+h1);
	
	h1.put(3, "Technologies");
	
	Set set = h1.entrySet();
	Iterator i1 = set.iterator();
	
	while (i1.hasNext()) {
//		System.out.println(i1.next());

//		Map.Entry meEntry = (Entry)i1.next();
		
//		System.out.println("Key is ..."+meEntry.getKey());
//		System.out.println("value is ..."+meEntry.getValue());
//		System.out.println();
		
		String s1 = i1.next().toString();
		
		String[] ss = s1.split("=");
		System.out.println("key is ..."+ss[0]);
		System.out.println("value is ..."+ss[1]);
		System.out.println();
	}
	
}
}
