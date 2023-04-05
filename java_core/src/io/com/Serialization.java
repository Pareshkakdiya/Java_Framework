package io.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Student implements Serializable {
	int rno;
	String name;
	double per;
	boolean res;
	public Student(int rno, String name, double per, boolean res) {
	
		this.rno = rno;
		this.name = name;
		this.per = per;
		this.res = res;
	}@Override
	public String toString() {
		return "Roll No :"+rno+"\nStudent Name :"+name+"\nPercentage :"+per+"\nResult :"+res;
		
	}

}

public class Serialization {
public static void main(String[] args) throws Exception {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter roll no :");
	int rollno = scanner.nextInt();
	
	System.out.println("Enter name :");
	String name = scanner.next();
	
	System.out.println("Enter percentage");
	double per = scanner.nextDouble();
	
	System.out.println("Enter result :");
	boolean result = scanner.nextBoolean();
	
	Student s = new Student(rollno, name, per, result);
	
	FileOutputStream fos = new FileOutputStream("name"); 
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	
 	oos.writeObject(s);
	oos.flush();
	oos. close();
	System.out.println("Object written successfully");
	
	FileInputStream fis = new FileInputStream("name");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Student s2 = (Student)ois.readObject();
	ois.close();
	System.out.println(s2);
	
	
	
}
}
