package io.com;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

class FDemo{
	File file;
	public FDemo() {
		// TODO Auto-generated constructor stub
		file = new File("file3.txt");
		try {
			file.createNewFile();
			display();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	
	public void display() {
		//is,can,has,boolean
		System.out.println("is file or not?..."+file.isFile());
		System.out.println("is directory or not?"+file.isDirectory());
		System.out.println("is excuted or not?..."+file.canExecute());
		System.out.println("can read or not?..."+file.canRead());
		System.out.println("can write or not?..."+file.canWrite());
		System.out.println("path of the file"+file.getPath());
		System.out.println("absolute path :"+file.getAbsolutePath());
		
	}
	
}

public class FileDemo {
public static void main(String[] args) {
	new FDemo();
}
}
