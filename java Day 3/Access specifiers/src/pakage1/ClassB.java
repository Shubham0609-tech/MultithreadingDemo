package pakage1;

// Within the package
public class ClassB {
	
	//private
//	ClassA n = new ClassA();
//	int number = n.pvt;
	
	//default
	ClassA n = new ClassA();
	public int number1 = n.def;
	
	//protected
	ClassA n2 = new ClassA();
	public int number2 = n2.pro;
	
	//public
	ClassA n3 = new ClassA();
	public int number3 = n3.pub;
	

}
