public class CalculateSum {
	int sum = 0;
	int calculateSum(int n) {
		int num = n;
		int digit = 0;
		while(num>0) {
			digit = num % 10;
			sum = sum + digit * digit * digit;
			num = num / 10;
		}
		return sum;
	}

}
