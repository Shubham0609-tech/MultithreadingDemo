public class CheckNumber {
	boolean checkNumber(int n) {
		boolean flag = false;
		int currentDigit = n % 10;
		n = n / 10; 
		while(n>0) {
			if(currentDigit < n%10) { 
				flag = true;
				break;
			}
			currentDigit = n % 10;
			n = n / 10;
		}
		return flag;
	}
}
