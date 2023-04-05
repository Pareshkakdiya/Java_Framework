package io.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ByteStreamDemo {
public static void main(String[] args) {
	try {
		File file = new File("file4.txt");
//		FileOutputStream fos = new FileOutputStream("File1.txt",true);
		FileOutputStream fos = new FileOutputStream(file,true);
		String msg = "\nTops Technologies...";
		byte[] b = msg.getBytes();//unboxing
		fos.write(b);
		fos.flush();//to empty object/release the data from the object
		fos.close();
		System.out.println("data written....");
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		FileInputStream fis = new FileInputStream("File1.txt");
		int x;
		while((x=fis.read())!=-1) {
			System.out.print((char)x);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
