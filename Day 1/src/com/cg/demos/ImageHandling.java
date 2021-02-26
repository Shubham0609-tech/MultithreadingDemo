package com.cg.demos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class ImageHandling {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("d:\\Java\\index.jpg")){
			FileOutputStream fos = new FileOutputStream("d:\\Java\\indexCopied.jpg");
			int val;
			while((val=fis.read())!=-1) {
				fos.write(val);
			}
			
		}
		catch(IOException | ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException ae)
		{
			System.out.println("Some exception");
		}
			
	}

}
