
public class ClassB extends ClassA {
	
	int number = 10;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public ClassB(){
		System.out.println("B" + number);
	}
}
