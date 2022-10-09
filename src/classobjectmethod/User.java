package classobjectmethod;

public class User {
	public int num1 = 10, num2 = 20;// instance variable

	public void printDetails() {// Method definition
		updateVariable();
		System.out.println("num1 " + num1);
		System.out.println("num2 " + num2);
	}

	public void updateVariable() {
		++num1;// 11 12 13
		++num2;// 21 22 23

	}

	public boolean loanEligibilityCheck(int salary) {
		float percentage = 0.5f;
		float eligibleAmount = salary * percentage;
		float eligibilityAmount = 30000;
		return eligibleAmount >= eligibilityAmount;

	}

	public void add() {
		System.out.println("add() num1+num2 " + (num1 + num2));
	}

	public void add(int n1, int n2) {
		System.out.println("add(int,int) n1+n2 " + (n1 + n2));
	}

	public void add(float n1, float n2) {
		System.out.println("add(float,float) n1+n2 " + (n1 + n2));
	}

	public double add(double n1, double n2) {
		System.out.println("double add(double,double) n1+n2 ");
		return (n1 + n2);
	}

}
