
public class CheckNumber {
	
	boolean checkNumber(int n) {
		if (n==0) {
			return false;
		}
		
		int floorValue = (int)Math.floor(Math.log(n) / Math.log(2));
		int ceilValue = (int)Math.ceil(Math.log(n) / Math.log(2));
		return (floorValue == ceilValue);
	}
	
}
