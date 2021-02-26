import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Enter the color 1:Red 2:Yellow 3:Green");
		Scanner scanObject = new Scanner(System.in);
		int lightColor = scanObject.nextInt();
		scanObject.close();
		TrafficLights t1 = new TrafficLights();
		t1.getSignal(lightColor);
	}
}
