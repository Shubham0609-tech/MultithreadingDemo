package com.cg.demos;

//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;

public class BufferedReading {

	public static void main(String[] args) {
		 try(BufferedReader reader = new BufferedReader(new FileReader("d:\\Java\\data.txt"))){
	            String line;
	            while ((line = reader.readLine()) !=null) {
	                System.out.println(line);
	            }
		}
		catch(IOException | ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException ae)
		{
			System.out.println("Some exception");
		}
			
	}

}
