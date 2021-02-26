import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		System.out.println("Enter any number");
		Scanner scanObject = new Scanner(System.in);
		int number = scanObject.nextInt();
		scanObject.close();
		CalculateSum sum1=new CalculateSum();
		result = sum1.calculateSum(number);
		System.out.println(result);
	}

}
