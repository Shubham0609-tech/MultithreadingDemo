package com.cg.demos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class ExceptionHandling {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("d:\\Java\\data.txt")){
			
			int val;
			while((val=fis.read())!=-1) {
				System.out.print((char)val);
			}
			
		}
		catch(IOException | ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException ae)
		{
			System.out.println("Some exception");
		}
			
	}

}
