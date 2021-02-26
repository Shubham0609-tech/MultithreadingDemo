import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutpuStream {

	public static void main(String[] args) {
		
		String data = "Hello World";
		FileOutputStream fs = null;
		
		try {
		
		fs = new FileOutputStream("d:\\Java\\.data.txt");
		
		byte[] arr = data.getBytes();
		
		fs.write(arr);
		}
		
		catch(FileNotFoundException fe)
		{
			System.out.println("File not found");
		}
		
		catch(IOException ioe)
		{
			System.out.println("Input output error");
		}
		
		finally {
			try {
				fs.close();
			}
			catch(IOException ioe) {
				System.out.println("Error in closing file");
			}
		}
	}

}
