package classobjectmethod;

public class User {
	int num1 = 10, num2 = 20;// instance variable

	public void printDetails() {
		updateVariable();
		System.out.println("num1 " + num1);
		System.out.println("num2 " + num2);
	}

	public void updateVariable() {
		++num1;// 11 12 13
		++num2;// 21 22 23

	}
}
