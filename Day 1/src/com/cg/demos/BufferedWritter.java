package com.cg.demos;

import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

public class BufferedWritter {

	public static void main(String[] args) {
		 try(BufferedReader reader = new BufferedReader(new FileReader("d:\\Java\\data.txt"))){
			 BufferedWriter writer = new BufferedWriter(new FileWriter(new File("d:\\Java\\dataCopiedByBuffer.txt")));
	            String line;
	            while ((line = reader.readLine()) !=null) {
	                writer.write(line);
	            }
		}
		catch(IOException | ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException ae)
		{
			System.out.println("Some exception");
		}
			
	}

}

