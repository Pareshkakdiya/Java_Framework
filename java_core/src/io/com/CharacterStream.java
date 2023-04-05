package io.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStream {
public static void main(String[] args) {
	try {
		FileWriter fos = new FileWriter("File2.txt",true);
		String msg = "\nTops Technologies...";
//		byte[] b = msg.getBytes();//unboxing
		fos.write(msg);
		fos.flush();//to empty object/release the data from the object
		fos.close();
		System.out.println("data written....");
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		FileReader fis = new FileReader("File2.txt");
		int x;
		while((x=fis.read())!=-1) {
			System.out.print((char)x);
		}
	} catch (Exception e) {
		e.printStackTrace();
	
     }
}
}

