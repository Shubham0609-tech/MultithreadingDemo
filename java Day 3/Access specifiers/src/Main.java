import pakage1.ClassA;
import pakage1.ClassB;
import pakage2.ClassC;
import pakage2.ClassD;

public class Main {
	
	public static void main(String args[]) {
		
		ClassA a = new ClassA();
		ClassB b = new ClassB();
		ClassC c = new ClassC();
		ClassD d = new ClassD();
		
		
		//Test B
		System.out.println(b.number3);
		System.out.println(b.number2);
		System.out.println(b.number1);
		
		//Test C
		System.out.println(c.n3);
		System.out.println(c.n4);
		
		//Test D
		System.out.println(d.number1);
		
	}
	

}
