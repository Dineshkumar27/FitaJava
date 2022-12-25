package methodoverloadingdemo;

public class Methodsexample {
	int num1 = 10, num2 = 20;

	public void add() {
		System.out.println("add() " + (num1 + num2));
	}

	public void add(int num1, int num2) {
		System.out.println("add(int,int) " + (num1 + num2));
	}

	public void add(float num1, float num2) {
		System.out.println("add(float,float) " + (num1 + num2));
	}

	public double add(double num1, double num2) {
		return (num1 + num2);
		"".in
	}

}
