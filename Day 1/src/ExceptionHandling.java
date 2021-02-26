
public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
			
			int a = 23;
			int b = 0;
			
			int result = a / b;
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Divide by zero");
		}
		
		finally {
			System.out.println("Finally block");
		}
		
	}

}
