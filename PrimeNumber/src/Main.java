
public class Main {

	public static void main(String[] args) {
		
		int number = 15;
		
		PrimeNo n1 = new PrimeNo();
		
		for(int i=2;i<number;i++) {
			if((n1.isPrime(i))) {
				System.out.println(i);				
			}
		}
	}

}
