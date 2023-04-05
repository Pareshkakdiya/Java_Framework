package com.collection;

import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
	Stack s1 = new Stack();
	s1.push("Paresh");
	s1.push(101);
	s1.push(101.23);
	s1.push("K");
	s1.push(true);
	
	System.out.println(s1);
	s1.pop();
	
	System.out.println(s1);
	s1.pop();
	
	System.out.println(s1);
	s1.pop();
	
	System.out.println(s1);
	s1.push("Kakadiya");
	
	System.out.println(s1);
	
}
}
