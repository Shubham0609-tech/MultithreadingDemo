
public class Fibonacci {
	
	int a = 0;
	int b = 1;
	int sum ;
	
	int fiboNumber(int n) {
		
		if(n==1 && n==2) {
			return 1;
		}
		
		else {
		for(int i=0 ; i<n-1 ; i++) {
			sum = a + b;
			a = b;
			b = sum;
			}		
		}
		return sum;
	}
	

}
