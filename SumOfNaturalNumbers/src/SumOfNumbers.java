public class SumOfNumbers {
	int sum=0;
	int findSum(int number) {
		for(int i=0 ; i<number ; i++) {
			if(i%3==0 || i%5==0) {
				sum = sum + i;
			}
		}
		return sum;
	}
}
