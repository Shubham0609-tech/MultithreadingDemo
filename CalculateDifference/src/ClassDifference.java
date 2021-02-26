public class ClassDifference {
	int sumOfSquares = 0;
	int squareOfSum = 0;
	int calculateDifference(int n) {
		for(int i=0 ; i<=n ; i++) {
			sumOfSquares = sumOfSquares + i * i;
		}
		for(int i=0 ; i<=n ; i++) {
			squareOfSum = squareOfSum + i;
		}
		squareOfSum = squareOfSum * squareOfSum;
		return (sumOfSquares - squareOfSum);
	}
}
