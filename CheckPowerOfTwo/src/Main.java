
public class Main {
	
	public static void main(String[] args) {
		
		boolean result;
		int number = 7;
		
		CheckNumber n = new CheckNumber();
		result = n.checkNumber(number);
		
		if(result) {
			System.out.println(number + " is a power of two");
		}else {
			System.out.println(number + " is not a power of two");
		}

	}
}